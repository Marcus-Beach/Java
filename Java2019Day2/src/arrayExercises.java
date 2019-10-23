public class arrayExercises {
    public static void main(String[] args){

        // 1. Create an array of 10 strings and set each element to something unique.
        String[] numWords = new String[10];
        numWords[0] = "Zero";
        numWords[1] = "One";
        numWords[2] = "Two";
        numWords[3] = "Three";
        numWords[4] = "Four";
        numWords[5] = "Five";
        numWords[6] = "Six";
        numWords[7] = "Seven";
        numWords[8] = "Oops";
        numWords[9] = "Nine";

        // 2. Create an array of 100 integers. Use a for loop to set the value of each element to the value of the
        // index parameter of the loop. Element 10 would be set to 10, element 0 would be set to 0.

        int[] century = new int[100];
        for (int i = 0; i < century.length; i++) {
            century[i] = i;
        }

        // 3. With your array of integers use a for loop to change each element to be the square of the number that it
        // contains.  Element 5 should originally hold the value of 5, your code will change it to be 25.

        for (int i = 0; i < century.length; i++) {
            century[i] *= century[i];
        }

        // 4.Set the second to the last value of your arrays to some new value. DO NOT hard code the index, use the
        // length of the array to figure out the second to the last position.

        numWords[(numWords.length - 2)] = "Eight";
        century[(century.length - 2)] = 100;

        // 5. Swap all the elements of the array. 0 and the last position should be swapped, 1 and the second to the
        // last position should be swapped. Do for the entire array. Of course use a loop. This means for your array
        // of ints position 0 will now hold 9801 (99 squared) and position 97 will hold 4, 98 will hold 1 and 99 will
        // hold 0.

        String holdString;
        for (int i = 0; i < (numWords.length / 2); i++) {
            holdString = numWords[i];
            numWords[i] = numWords[((numWords.length - 1) - i)];
            numWords[((numWords.length - 1) - i)] = holdString;
        }
        int holdInt;
        for (int i = 0; i < (century.length / 2); i++) {
            holdInt = century[i];
            century[i] = century[((century.length - 1) - i)];
            century[((century.length - 1) - i)] = holdInt;
        }
    }
}
