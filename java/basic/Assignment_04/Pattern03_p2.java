package Assignment_04;

public class Pattern03_p2 {
    public static void main(String[] args) {
        int n = 4, i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= (2 * i - 1); j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {

                    System.out.print(i);
                }

            }
            System.out.println();
        }
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= (2 * i - 1); j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {

                    System.out.print(i);
                }

            }
            System.out.println();
        }

    }
}
