import java.util.Arrays;
import java.util.Scanner;
class NthLargestNumber1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();
        int nthLargest = findNthLargest(array, N);

        System.out.println(N + "th Largest number: " + nthLargest);
        scanner.close();
    }

    private static int findNthLargest(int[] array, int N) {
        Arrays.sort(array); 
        int size = array.length;
        if (N > 0 && N <= size) {
            return array[size - N];
        } else {
            throw new IllegalArgumentException("Invalid value of N. N should be between 1 and " + size);
        }
    }
}
