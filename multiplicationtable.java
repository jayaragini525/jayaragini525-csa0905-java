import java.util.*;

class multiplicationtable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m,n,result;
        System.out.print("Enter the value of M: ");
        m = s.nextInt();

        System.out.print("Enter the value of N: ");
        n = s.nextInt();

        if (m <= 0 || n <= 0) {
            System.out.println("M and N should be positive integers.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            result = i * m;
            System.out.println(i + "x" + m + "=" + result);
        }

    }
}
