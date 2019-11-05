public class AssignmentSix {
    public static void main(String[] args){
        String rick = "Of all the gin joints in all the towns in the world, she walks in to mine.";
        System.out.println(rick.length());
        String renault = "I'm shocked, shocked to find that gambling is going on in here!";
        System.out.println(renault.charAt(25));
        System.out.println(renault.indexOf("shocked"));
        renault = renault.replaceFirst("shocked", "SHOCKED");
        System.out.println(renault);
        renault = renault.substring(0, renault.indexOf("shocked")) + "SHOCKED" + renault.substring(renault.indexOf("shocked") + 7);
        System.out.println(renault);
        String phrase = "Play it, Sam. Play ‘As Time Goes By.’";
        String subPhrase = phrase.substring (14, 35);
        System.out.println(subPhrase);
        System.out.println(subPhrase.length());

        String original = "Java Software";
        int   space  = original.indexOf(' ');
        String soft  = original.substring(space+1,space+5);
        String ware  = original.substring(9);
        System.out.println(ware.toUpperCase() + " " + soft.toLowerCase());

        String[] words = "This is a string with how many words".split(" ");
        System.out.println("this is the 4th word in the string " + words[3]);
        System.out.println("The string had how many words? " + words.length);

        String replace = original.replace("a","_");
        System.out.println(replace);
        System.out.println(original.replaceFirst("a","_"));

    }
}
