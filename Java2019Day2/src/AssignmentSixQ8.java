public class AssignmentSixQ8 {
    public static void main(String[] args){
        // 1.
        String original = "She said, \"Oh, no you did\"t\nand I said, \"Oh yes I did\"";
        System.out.println(original);

        // 2.
        //  Replace “She” with “Barbara”
        original = original.replaceFirst("She", "Barbara");

        // Add a comma “,” after the second “Oh”
        original = original.substring(0, (original.indexOf("Oh", (original.indexOf("Oh") + 1)) + 2)) + "," +
                original.substring((original.indexOf("Oh", (original.indexOf("Oh") + 1)) + 2));
        // Capitalize “did”
        original = original.substring(0,(original.indexOf("did", (original.indexOf("did") + 1)))) +
                original.substring((original.indexOf("did", (original.indexOf("did") + 1))),((original.indexOf("did", (original.indexOf("did") + 1))) + 1)).toUpperCase() +
                original.substring((original.indexOf("did", (original.indexOf("did") + 1))) + 1);
        System.out.println(original);
    }
}
