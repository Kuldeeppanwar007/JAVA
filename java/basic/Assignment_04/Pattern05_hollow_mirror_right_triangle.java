package Assignment_04;

public class Pattern05_hollow_mirror_right_triangle {
    public static void main(String[] args) {
        int n = 9, i, j, k;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                if (i == 9 || k == 1 || i == 1 || k == 9 || k == i) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
