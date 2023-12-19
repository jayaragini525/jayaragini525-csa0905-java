import java.util.*;
class Reverse {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String string = s.nextLine();
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }
        System.out.println("Alphabetical Order: " + new String(charArray));
    }
}