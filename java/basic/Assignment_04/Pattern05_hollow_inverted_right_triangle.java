package Assignment_04;

public class Pattern05_hollow_inverted_right_triangle {
    public static void main(String[] args) {
        int n = 9, i, j;
        for (i = 1; i <= n; i++) {
            for (j = i; j <= n; j++) {
                 if (i == 1 || j == n || i==j) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
