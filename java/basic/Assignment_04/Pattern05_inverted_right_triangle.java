package Assignment_04;

public class Pattern05_inverted_right_triangle {
    public static void main(String[] args) {
        int n = 8, i, j;
        for (i = 1; i <= n; i++) {
            for (j = i; j <= n; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

}
