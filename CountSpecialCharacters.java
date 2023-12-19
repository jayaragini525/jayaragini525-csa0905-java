import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountSpecialCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the statement: ");
        String statement = scanner.nextLine();

        int specialCharCount = countSpecialCharacters(statement);

        System.out.println("Given statement: " + statement);
        System.out.println("Number of special characters: " + specialCharCount);

        scanner.close();
    }

    private static int countSpecialCharacters(String str) {
        // Using regular expression to match special characters
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9\\s]");
        Matcher matcher = pattern.matcher(str);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count;
    }
}
