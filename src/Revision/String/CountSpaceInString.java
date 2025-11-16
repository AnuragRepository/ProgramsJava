package Revision.String;

public class CountSpaceInString {

    public static void main(String[] args) {
        String input = "My   Name Is    Anurag";
        spaceInFullString(input);
        spaceBetweenTwoWordsInString(input);
    }

    public static void spaceInFullString(String input) {
        int spaceCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        System.out.println("Space In given String - " +input+" = "+spaceCount);
    }

    public static void spaceBetweenTwoWordsInString(String input) {

        String updatedString = input.substring(0,9);
        spaceInFullString(updatedString);

    }
}
