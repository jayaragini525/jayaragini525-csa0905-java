import java.util.*;
class Palindrome12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Check if a string is a palindrome");
        System.out.println("2. Check if a number is a palindrome");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter a string:");
                String inputString = scanner.next();
                if (isPalindromeString(inputString)) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not a Palindrome");
                }
                break;

            case 2:
                System.out.println("Enter a number:");
                int inputNumber = scanner.nextInt();
                if (isPalindromeNumber(inputNumber)) {
                    System.out.println("Palindrome");
                } else {
                    System.out.println("Not a Palindrome");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
    private static boolean isPalindromeString(String str) {
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    private static boolean isPalindromeNumber(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }
}
