package Assignment_04;

public class Pattern02_p4_pyramid {
    public static void main(String[] args) {
        int n = 5, i, j, k;
        for (i = 1; i <= n; i++) {
            for (j = i; j <= 8; j++) {
                System.out.print("*");

            }
            for (k = 1; k <= i; k++) {
                System.out.print(i + "*");
            }

            for (j = i; j <= 7; j++) {
                System.out.print("*");

            }
            System.out.println();
        }

    }
}
