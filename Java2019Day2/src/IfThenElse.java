public class IfThenElse {
    public static void main(String[] args) {
        float      orderValue = 50.0f;
        boolean    saturdayDelivery = true;         // true or false
        String     destination = "US";              // "US", "Canada", "Mexico"
        float overOnehundred = 0;
        float satDev = 0;

        if (orderValue > 100){
            overOnehundred = 1;
        }
        if(saturdayDelivery){
            satDev = 1;
        }

        float deliveryCost;
        if ( destination.equals("US") ) {
            deliveryCost = 20.0f + (-5.0f * overOnehundred) + (10.0f * satDev);
        } else if ( destination.equals("Mexico") ) {
            deliveryCost = 32.0f + (-7.0f * overOnehundred) + (20.0f * satDev);
        } else {      // Assume that the country is Canada
            deliveryCost = 25.0f + (-7.0f * overOnehundred) + (12.0f * satDev);
        }

        int numLessThanFive = 3;
        String numInfo = "This number " + numLessThanFive + " is";
        if(numLessThanFive % 2 == 0){
            numInfo += " even";
        }
        if(numLessThanFive == 2 || numLessThanFive == 3 || numLessThanFive == 5){
            if(numLessThanFive % 2 == 0){
                numInfo += " and is";
            }
            numInfo += " a prime";
        }
        if(numLessThanFive == 1 || numLessThanFive == 4 ){
            if((numLessThanFive % 2 == 0) || (numLessThanFive == 2 || numLessThanFive == 3 || numLessThanFive == 5)){
                numInfo += " and is";
            }
            numInfo += " a square";
        }
        if(numLessThanFive == 0){
            numInfo += ", though I find the idea of nothing being even a little odd";
        }
        numInfo += ".";
        if (numLessThanFive == 1){
            numInfo += "  One is the loneliest number.";
        }
        System.out.println(numInfo);
        int aNumber = 3;
        if (aNumber >= 4)
            if (aNumber == 0)
                System.out.println ("first string");
        else System.out.println ("second string");
        System.out.println ("third string");

    }
}
