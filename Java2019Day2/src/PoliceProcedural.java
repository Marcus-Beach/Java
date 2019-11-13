public class PoliceProcedural {
    private   String      title;              // "NCIS", "NCIS L.A.", "NCIS Ne Orleans", "NCIS Moon Base 1"
    private   String      location;           // New York, Chicago, LA
    private   String      style;              //  "Gritty", "Comedy", "Drama", "Inner City"
    private   boolean     ensemble;           // true - ensemble, false buddy
    private   boolean     forensicBased;      //  true = CSI, NCIS, false - Dragnet, Monk, Dick Tracy

    public PoliceProcedural(String title, String location, String style, boolean ensemble, boolean forensicBased) {
        this.title = title;
        this.location = location;
        this.style = style;
        this.ensemble = ensemble;
        this.forensicBased = forensicBased;
    }

    public PoliceProcedural(String title, String location) {
        this.title = title;
        this.location = location;
        this.style = "";
    }

    public PoliceProcedural(String title, boolean forensicBased) {
        this.title = title;
        this.forensicBased = forensicBased;
        this.style = "";
        this.location = "";
    }

    @Override
    public String toString() {
        String retString = "";
        if(!title.isEmpty()){
            retString += "Title: " + title + "\n";
        }
        if(!location.isEmpty()){
            retString += "Location: " + location + "\n";
        }
        if(!style.isEmpty()){
            retString += "Style: " + style + "\n";
        }
        try{
            if(ensemble){
                retString += "Ensemble\n";
            }else {
                retString += "Buddy\n";
            }
        }
        catch (NullPointerException e){
            retString += "Ensemble not set.";
        }
        try{
            if(forensicBased){
                retString += "Forensic Based\n";
            }else {
                retString += "Not Forensic Based\n";
            }
        }
        catch (NullPointerException e){
            retString += "Forensic Based not set.";
        }
        return retString;
    }

    public static void main(String[] args) {
        PoliceProcedural NCIS = new PoliceProcedural("NCIS", "New York", "Drama", true, true);
        PoliceProcedural NCISLA = new PoliceProcedural("NCIS", "LA");
        PoliceProcedural DN = new PoliceProcedural("Dragnet", false);

        System.out.println(NCIS.toString());
        System.out.println(NCISLA.toString());
        System.out.println(DN.toString());
    }
}
