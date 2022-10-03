package Assignment_04;

public class Pattern06_diamond_star {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (i % 2 == 1)

                    System.out.print("* ");

            }
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <=i ; j++) {
                System.out.print(" ");
            }
            for (int k = n; k >= i; k--) {
                if (i % 2 == 1)
                    System.out.print("* ");

            }
            System.out.println();
        }

    }
}