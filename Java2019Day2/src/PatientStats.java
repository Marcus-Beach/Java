public class PatientStats {
    public static void main(String[] args) {
        String tempDiag = "";
        String heightDiag = "";
        String feelingDiag = "";
        boolean stop = false; // if the patient is dead or there's an emergency don't continue

        String pName = Utils.getInput("Enter patient name: ");
        double pTemp = Utils.getDouble("Enter patient temperature: ");
        String pBP = Utils.getInput("Enter patient blood pressure: ");
        double pHeight = Utils.getDouble("Enter patient height in meters: ");
        double pWeight = Utils.getDouble("Enter patient weight in kilograms: ");
        int pAge = Utils.getNumber("Enter patient age in years: ");
        int pFeeling = Utils.getNumber("On a scale of one to five how is the patient feeling (1-bad 5-great): ", 6);
        String pReason = Utils.getInput("Reason for patient's visit: ");

        String pDiag = "Preliminary diagnosis for patient " + pName + ":\n";

        if (pTemp < 72.0f) {
            tempDiag += "Patient has probably been dead for several days.";
            stop = true;
        } else if (pTemp < 87.5) {
            tempDiag += "Patient just recently dead.";
            stop = true;
        } else if (pTemp < 96) {
            tempDiag += "Get patient a blanket.";
        } else if (pTemp < 99) {
            tempDiag += "Normal temperature.";
        } else if (pTemp < 102) {
            tempDiag += "Suggest patient take some aspirin.";
        } else if (pTemp < 106) {
            tempDiag += "Call the ER.";
            stop = true;
        }else {
            tempDiag += "Call the CDC.";
            stop = true;
        }

        pDiag += tempDiag + "\n";

        if (!stop){

            if(pHeight < 1.5d){
                heightDiag += "Suggest growth hormones.";
            }
            if(pHeight > 2.4d){
                heightDiag += "Suggest trying out for the Mavs.";
            }
            switch (pFeeling){
                case 1: feelingDiag += "Patient feels terrible."; break;
                case 2: feelingDiag += "Patient has had worse days but not many."; break;
                case 3: feelingDiag += "Patient feels \"ok\"."; break;
                case 4: feelingDiag += "Patient feels good."; break;
                case 5: feelingDiag += "Patient probably just got job as a programmer."; break;
                default: feelingDiag += "Patient refused to comment on how they are feeling."; break;
            }
            pDiag += (heightDiag.isEmpty() ? "" : heightDiag + "\n") + feelingDiag + "\n";
        }
        System.out.println(pDiag);
    }
}