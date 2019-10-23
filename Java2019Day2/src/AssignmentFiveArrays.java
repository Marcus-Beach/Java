public class AssignmentFiveArrays {
    public static void main(String[] args){
        int arraySize = (int) (Math.random() * 50) + 10;
        int[] myRandom = new int[arraySize];

        for (int i = 0; i < myRandom.length; i++) {
            myRandom[i] = (int) (Math.random() * 100) + 5;
        }
        for (int i = 0; i < myRandom.length; i++) {
            if(i < 5 || i > (myRandom.length - 6)){
                System.out.println("Index: " + i + " Value: " + myRandom[i]);
            }
        }
    }
}
