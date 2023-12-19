import java.util.*;

class MatrixMultiplication1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows for matrix A: ");
        int numRowsA = s.nextInt();
        System.out.print("Enter the number of columns for matrix A: ");
        int numColsA = s.nextInt();
        System.out.print("Enter the number of rows for matrix B: ");
        int numRowsB = s.nextInt();
        System.out.print("Enter the number of columns for matrix B: ");
        int numColsB = s.nextInt();

        if (numColsA != numRowsB) {
            System.out.println("Matrix multiplication is not possible. The number of columns in matrix A must be equal to the number of rows in matrix B.");
            return;
        }
        int[][] matrixA = new int[numRowsA][numColsA];
        System.out.println("Enter the elements of matrix A:");
        for (int i = 0; i < numRowsA; i++) {
            for (int j = 0; j < numColsA; j++) {
                matrixA[i][j] = s.nextInt();
            }
        }
        int[][] matrixB = new int[numRowsB][numColsB];
        System.out.println("Enter the elements of matrix B:");
        for (int i = 0; i < numRowsB; i++) {
            for (int j = 0; j < numColsB; j++) {
                matrixB[i][j] = s.nextInt();
            }
        }
        int[][] resultMatrix = new int[numRowsA][numColsB];

        for (int i = 0; i < numRowsA; i++) {
            for (int j = 0; j < numColsB; j++) {
                for (int k = 0; k < numColsA; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        System.out.println("Result Matrix:");
        for (int i = 0; i < numRowsA; i++) {
            for (int j = 0; j < numColsB; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}