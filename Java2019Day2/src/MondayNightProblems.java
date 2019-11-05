import java.util.Arrays;

public class MondayNightProblems {
    public static void main(String[] args) {

        //1. Output numbers from one to one-hundred
        //multiples of three output fizz instead
        //multiples of five output buzz instead
        //multiples of three and five output fizzbuzz
        // 1 2 fizz 4 buzz...

        String fizzbuzz = ""; // Initialize just because
        for (int i = 1; i < 101; i++) {
            fizzbuzz = "";  //clear the output string
            if (i % 3 == 0) {
                fizzbuzz += "fizz";  // handle case 3 and first part of 15
            }
            if (i % 5 == 0) {
                fizzbuzz += "buzz"; // handle case 5 and second part of 15
            }
            if (fizzbuzz.isEmpty()) {  // if it's empty it's not a multiple of 3 or 5
                System.out.println(i); // print the number
            } else {
                System.out.println(fizzbuzz); // print the string generated
            }
        }

        //2. test a string to see if it is a palindrome
        //level, a man a plan a canal panama
        //go hang a salami I'm a lasangna hog
        String palString = ""; // allow for hard coded test string
        if (palString.isEmpty()) { // get a string if one isn't hard coded
            palString = Utils.getInput("Enter a string to be tested as a palindrome: ");
        }
        char[] testString = palString.toLowerCase().toCharArray(); // to lower the string and then char array it
        palString = ""; // empty the string to have a place to build it back without the characters we don't care about
        for (int i = 0; i < testString.length; i++) {
            if (testString[i] > 96 && testString[i] < 123) { // anything that's a lowercase alpha
                palString += testString[i]; // add to the string
            }
        }
        testString = palString.toCharArray();  // dump the filtered string back in
        boolean isPal = true; // if we get through we're done
        for (int i = 0; i < (testString.length / 2); i++) {  // only need to test halfway through
            if (testString[i] != testString[testString.length - i - 1]) {  // start at the ends and test to the middle
                isPal = false; // if there's not a match it's not a palindrome
            }
        }
        if (isPal) {  // that's it
            System.out.println("The string was a palindrome");
        } else {
            System.out.println("The string was not a palindrome");
        }

        //3. integer array of size 100
        //each integer between 1 and 100 represented once
        //except one is missing and one is duplicated
        //method that finds missing and duplicated

        //method 1
        int[] numArray = getRandomArray(); // get a random array of integers with values 1-100

        int r = getRandom99(); // get two random positions
        int x = getRandom99();
        if (x == r) {
            x += (x == 99 ? -1 : 1);
        } // if somehow both get the same number, move one up or down
        numArray[x] = numArray[r]; // copy one value over another
        int dupe = 0;
        int missing = 0;
        boolean there;
        for (int i = 0; i < numArray.length; i++) {
            there = false; // assume not there
            for (int j = 0; j < numArray.length; j++) {
                if (numArray[i] == numArray[j]) { // if two values the same dupe is found
                    dupe = numArray[i];
                }
                if (numArray[j] == (i + 1)) { // if there's a number that has the value of a position then it's not missing
                    there = true;
                }
            }
            if (!there) {  // if it's not there we found it.
                missing = i;
            }
        }
        System.out.println("Dupe: " + dupe + "\nMissing: " + missing);

        numArray = getRandomArray(); // get a random array of integers with values 1-100
        r = getRandom99(); // get two random positions
        x = getRandom99();
        if (x == r) {
            x += (x == 99 ? -1 : 1);
        } // if somehow both get the same number, move one up or down
        numArray[x] = numArray[r]; // copy one value over another
        Arrays.sort(numArray); // sort the array
        x=0; // going to tally the values
        for (int i = 0; i < (numArray.length-1); i++) { // -1 to not go off the end of the array looking forward
            if (numArray[i] == numArray[(i+1)]) { // if two of the same number found we're found the dupe
                dupe = numArray[i];
            }
            x+=numArray[i]; // add all the numbers together
        }
        x+=numArray[(numArray.length - 1)];
        missing = 5050 - (x - dupe); // total value of all numbers 1-100 added - (total value - the duplicate) = missing
        System.out.println("Dupe: " + dupe + "\nMissing: " + missing);

        //4. Christmas tree
        // prompt user for height of a tree and make symmetrical tree
        //     *
        //    ***
        //   *****
        //  *******
        // *********
        int tree = Utils.getNumber("How tall do you want your tree? ");
        String space = " ";
        String star = "*";
        for (int i = 0; i < tree; i++) {
            System.out.println(space.repeat(tree - i) + star.repeat(1 + (i*2)));
        }

    }

    public static int getRandom99(){
        return (int)Math.ceil(Math.random() * 99d);
    }
    public static int[] getRandomArray(){
        int x = 0;
        int r = 0;
        int [] numArray = new int[100];
        for (int i = 1; i < numArray.length; i++) { // fill the array
            numArray[i] = i + 1;
        }
        for (int i = 0; i < numArray.length; i++) { // scramble the array
            r = getRandom99();
            x = numArray[r];
            numArray[r] = numArray[i];
            numArray[i] = x;
        }

        return numArray;
    }
}
