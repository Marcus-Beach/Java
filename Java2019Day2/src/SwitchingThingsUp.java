public class SwitchingThingsUp {
    public static void main(String[] args) {
        float      orderValue;
        boolean    saturdayDelivery;       // true or false
        String     destination;            // "US", "Canada", "Mexico"

        System.out.println(getDelCost(200f, true, "Canada"));
        System.out.println(getDelCost(100f, false, "Mexico"));
        System.out.println(getDelCost(50f, true, "US"));
        System.out.println(getDelCost(600f, false, "US"));
        System.out.println(getDelCost(100f, false, "Canada"));
    }
    public static float getDelCost(float orderValue, boolean saturdayDelivery, String destination){
        float overOnehundred = 0;
        float satDev = 0;

        if (orderValue > 100){
            overOnehundred = 1;
        }
        if(saturdayDelivery){
            satDev = 1;
        }

        float deliveryCost;
        switch ( destination ) {
            case "US":
                deliveryCost = 20.0f + (-5.0f * overOnehundred) + (10.0f * satDev);
                break;
            case "Mexico":
                deliveryCost = 32.0f + (-7.0f * overOnehundred) + (20.0f * satDev);
                break;
            default:      // Assume that the country is Canada
                deliveryCost = 25.0f + (-7.0f * overOnehundred) + (12.0f * satDev);
                break;
        }
        return deliveryCost;
    }
}
