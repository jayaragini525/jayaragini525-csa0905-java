import java.util.*;

class Nthlargestnumber {
    public static void main(String args[]) {
        int[] array = {14, 67, 48, 5, 62, 23};
        int n = 4;

        int nthLargest = findNthLargest(array, n);

        if (nthLargest != -1) {
            System.out.println(n + "th Largest number: " + nthLargest);
        } else {
            System.out.println("Invalid input.The array doesn't have a " + n + "th largest number.");
        }
    }

    public static int findNthLargest(int[] array, int n) {
        if (n > 0 && n <= array.length) {
   
            Arrays.sort(array);
       
            return array[array.length - n];
        } else {
            return -1; 
        }
    }
}
