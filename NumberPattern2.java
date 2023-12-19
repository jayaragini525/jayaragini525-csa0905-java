import java.util.Scanner;
class NumberPattern2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number to be printed: ");
        String number = s.next();
        System.out.print("Max Number of times to be printed: ");
        int maxPrint = s.nextInt();
        for (int i = 1; i <= maxPrint; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
            }
            System.out.println();
        }
        for (int i = maxPrint - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
            }
            System.out.println();
        }
    }
}