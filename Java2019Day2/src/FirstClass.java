public class FirstClass {
    public static void main(String[] args){
        System.out.println("Hello World");
        int number = 37;
        System.out.println("This is a number " + number);

        char character = 'z';
        System.out.println("This is a character " + character);

        double pi = Math.PI;
        System.out.println("The famous number PI " + pi);

        // 1. Create new variables for each of the Java Primitives (byte, int...).
        // Maybe create a bunch of variables that describe you- age, height, name, address, middle initial, ...
        byte myAge = 36;
        short numberOfKids = 1;
        int numberOfCars = 2;
        long numberOfTrees = 11;
        String myName = "Marcus Beach";
        char middleInitial = 'B';
        float myHeightInInches = 71.5f;
        double myWeightInLbs = 168.73d;
        boolean imAlive = true;

        // 2. Print them to the console.
        System.out.println("Name: " + myName + "\nMiddle Initial: " + middleInitial + "\nAge: " + myAge + "\nHeight in Inches: " +
                            myHeightInInches + "\nWeight in lbs: " + myWeightInLbs + "\nNumber of Kids: " + numberOfKids +
                            "\nCars: " + numberOfCars + "\nTrees: " + numberOfTrees + "\nI'm alive: " + imAlive);

        // 3. Print multiple variables on the same line.
        System.out.println("Name: " + myName + " Middle Initial: " + middleInitial + " Age: " + myAge + " Height in Inches: " +
                myHeightInInches + " Weight in lbs: " + myWeightInLbs + " Number of Kids: " + numberOfKids +
                " Cars: " + numberOfCars + " Trees: " + numberOfTrees + " I'm alive: " + imAlive);

        // 4. Create a new variable and add several numbers together and assign the total value to this new variable.
        long sumOfNums;
        sumOfNums = myAge + numberOfCars + numberOfKids + numberOfTrees;

        // 5. Create a new integer variable assign it the value of your char variable and print the int and char variables.
        // Change the character a few times to see what is printed.

        int charAsInt = middleInitial;
        System.out.println("Character: " + middleInitial + "\nAs an int: " + charAsInt);
        charAsInt = 'C';
        System.out.println("Character: C\nAs an int: " + charAsInt);
        charAsInt = 'c';
        System.out.println("Character: c\nAs an int: " + charAsInt);
        charAsInt = 'A';
        System.out.println("Character: A\nAs an int: " + charAsInt);

        // 6. Create and print a random number. Use Math.random().
        // When you type Math. let the IDE show you the many things you can do with the Math package.
        long randomNum = Math.round(Math.ceil(Math.random() * 100));
        System.out.println(randomNum);
    }
}
