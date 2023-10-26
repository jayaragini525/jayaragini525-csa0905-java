import java.util.*;

class decimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = s.nextInt();

        String binaryNumber = Integer.toBinaryString(decimalNumber);
        String octalNumber = Integer.toOctalString(decimalNumber);

        System.out.println("Binary Number = " + binaryNumber);
        System.out.println("Octal Number = " + octalNumber);

    }
}
