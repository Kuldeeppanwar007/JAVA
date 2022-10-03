package Assignment_04;

public class Pattern06_plus_pattern {
    public static void main(String[] args) {
        int n = 13, i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i == 7 || j == 7) {
                    System.out.print("+ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
