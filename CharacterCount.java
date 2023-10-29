import java.util.*;

class CharacterCount {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        
        int uppercaseCount = 0;
        int lowercaseCount = 0;
        int digitCount = 0;
        
        System.out.println("Enter characters (terminate with '*'):");

        char inputChar;
        
        while (true) {
            inputChar = s.next().charAt(0);

            if (inputChar == '*') {
                break;
            }
            
            if (Character.isUpperCase(inputChar)) {
                uppercaseCount++;
            } else if (Character.isLowerCase(inputChar)) {
                lowercaseCount++;
            } else if (Character.isDigit(inputChar)) {
               digitCount++;
            }
        }
        
        System.out.println("Uppercase letters entered: " + uppercaseCount);
        System.out.println("Lowercase letters entered: " + lowercaseCount);
        System.out.println("Digits entered: " + digitCount);
    }
}