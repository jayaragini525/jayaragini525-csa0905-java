import java.util.Scanner;

class ReduceToZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        int steps = reduceToZero(num);

        System.out.println("Number of steps to reduce it to zero: " + steps);

        scanner.close();
    }

    private static int reduceToZero(int num) {
        int steps = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                // If the current number is even, divide it by 2
                num /= 2;
            } else {
                // If the current number is odd, subtract 1 from it
                num -= 1;
            }

            steps++;
        }

        return steps;
    }
}
