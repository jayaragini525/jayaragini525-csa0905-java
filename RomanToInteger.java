import java.util.HashMap;
import java.util.Scanner;

public class RomanToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine().toUpperCase(); // Convert to uppercase for case-insensitivity

        int result = romanToInteger(romanNumeral);

        System.out.println("Integer representation: " + result);

        scanner.close();
    }

    private static int romanToInteger(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        // Initialize the mapping of Roman numerals to integers
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            int currentNum = romanMap.get(s.charAt(i));

            // Check if the next numeral is greater than the current one
            if (i + 1 < s.length() && romanMap.get(s.charAt(i + 1)) > currentNum) {
                result += romanMap.get(s.charAt(i + 1)) - currentNum;
                i++; // Skip the next numeral since it has been considered
            } else {
                result += currentNum;
            }
        }

        return result;
    }
}
