import java.util.*;
class RemoveVowels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = s.nextLine();

        String stringWithoutVowels = removeVowels(inputString);

        System.out.println("The string without vowels is: " + stringWithoutVowels);
    }

    public static String removeVowels(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' &&
                c != 'A' && c != 'E' && c != 'I' && c != 'O' && c != 'U') {
                result.append(c);
            }
        }

        return result.toString();
    }
}