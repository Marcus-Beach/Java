public class AssignmentSixQ7 {
    public static void main(String[] args){
        String myName = "Marcus Bryan Beach";
        String initials = "";
        String[] nameArray = myName.split(" ");
        for (int i = 0; i < nameArray.length; i++) {
            initials += nameArray[i].substring(0,1).toLowerCase();
        }
        System.out.println(initials);
    }
}
