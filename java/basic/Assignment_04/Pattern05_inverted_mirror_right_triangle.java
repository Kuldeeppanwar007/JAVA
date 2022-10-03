package Assignment_04;

public class Pattern05_inverted_mirror_right_triangle {
    public static void main(String[] args) {
        int n = 9, i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (j = n; j >= i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

}
