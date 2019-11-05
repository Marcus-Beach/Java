public class SwitchingThingsUp2 {
    public static void main(String[] args) {
        System.out.println("Saturday " + weekdayAsNum("Saturday"));
        System.out.println("friday " + weekdayAsNum("friday"));
        System.out.println("MO " + weekdayAsNum("MO"));
        System.out.println("sun " + weekdayAsNum("sun"));
        System.out.println("Tue " + weekdayAsNum("Tue"));
        System.out.println("oops " + weekdayAsNum("oops"));
    }
    public static int weekdayAsNum(String day){
        String fDay = day.toLowerCase().substring(0,2);
        int nDay;
        switch (fDay){
            case "su": nDay = 0; break;
            case "mo": nDay = 1; break;
            case "tu": nDay = 2; break;
            case "we": nDay = 3; break;
            case "th": nDay = 4; break;
            case "fr": nDay = 5; break;
            case "sa": nDay = 6; break;
            default: nDay = -1; break;
        }
        return nDay;
    }
}
