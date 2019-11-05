public class SwitchCalculator {
    public static void main(String[] args) {
        String opCh = "";
        do {
            // 1. get operation
            opCh = Utils.getInput("Select an operation or something else to quit (+,-,*,/,^): ");

            switch (opCh) {
                case "+": Add(); break;
                case "-": Sub(); break;
                case "*": Mult(); break;
                case "/": Div(); break;
                case "^": Pow(); break;
                default: System.out.println("Exiting..."); return;
            }
        } while(true);
    }

    public static void Add(){
        // get numbers and add them
        double num1 = Utils.getDouble("Enter the first number to add: ");
        double num2 = Utils.getDouble("Enter the second number to add: ");
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        return;
    }

    public static void Sub(){
        // get numbers and subtract them
        double num1 = Utils.getDouble("Enter the number to subtract from: ");
        double num2 = Utils.getDouble("Enter the number to subtract from the first: ");
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        return;
    }

    public static void Mult(){
        // get numbers and multiply them
        double num1 = Utils.getDouble("Enter the first number to multiply: ");
        double num2 = Utils.getDouble("Enter the second number to multiply: ");
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        return;
    }

    public static void Div(){
        // get numbers and divide them
        double num1 = Utils.getDouble("Enter the number to divide: ");
        double num2 = Utils.getDouble("Enter the number to divide by: ");
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        return;
    }

    public static void Pow(){
        // get numbers and raise one to the power of the other
        double num1 = Utils.getDouble("Enter the number to raise to a power: ");
        double num2 = Utils.getDouble("Enter the power to raise by: ");
        System.out.println(num1 + " ^ " + num2 + " = " + (Math.pow(num1, num2)));
        return;
    }
}
