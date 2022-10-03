package Assignment_04;

public class Pattern03_p4 {
    public static void main(String[] args) {
        int n = 4, i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {

                    System.out.print(" *");
                } else {
                    if (j < (i + 1)) {
                        System.out.print(" " + (j - 1));

                    } else {
                        System.out.print(" " + ((2 * i - 1) - j));

                    }

                }

            }
            System.out.println();
        }

        for (i = n - 1; i >= 0; i--) {
            for (j = 1; j <= (2 * i - 1); j++) {
                if (j == 1 || j == (2 * i - 1)) {

                    System.out.print(" *");
                } else {
                    if (j < (i + 1)) {
                        System.out.print(" " + (j - 1));

                    } else {
                        System.out.print(" " + ((2 * i - 1) - j));

                    }

                }

            }
            System.out.println();
        }

    }
}
