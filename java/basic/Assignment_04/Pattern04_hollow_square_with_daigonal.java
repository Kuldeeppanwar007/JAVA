package Assignment_04;

public class Pattern04_hollow_square_with_daigonal {
    public static void main(String[] args) {
        int n = 9, i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n || i == j || j == n - i + 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}