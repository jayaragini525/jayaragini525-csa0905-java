import java.util.*;

public class LastWordLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int lastWordLength = lengthOfLastWord(inputString);

        System.out.println("Length of the last word: " + lastWordLength);

        scanner.close();
    }

    private static int lengthOfLastWord(String s) {
        s = s.trim();

        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
           
            if (s.charAt(i) == ' ') {
                break; 
            }
            length++;
        }

        return length;
    }
}
