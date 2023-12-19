class RightSideUpsideDownPattern {
    public static void main(String[] args) {
        int n = 4; // Change this to adjust the number of rows

        // Right-side facing triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(i);
        }

        // Upside-down right-side facing triangle
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(i);
        }
    }
}