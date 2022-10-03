package Assignment_04;

public class Pattern03_p3 {
    public static void main(String[] args) {
        int n = 4, i, j, count = 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= (2 * i - 1); j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {

                    System.out.print(count);
                    count++;

                }

            }
            System.out.println();
        }
        int x = count;//11 n=4;
        for (i = n; i >= 1; i--) {
             x-= i;
            for (j = 1; j <= (2 * i - 1); j++) {
                if (j % 2 == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(x++);
                    --count;

                }

            }
            x= count;
            System.out.println();
        }

    }

}
