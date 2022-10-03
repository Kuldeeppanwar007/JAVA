package Assignment_04;

public class Pattern04_hollow_rightTriangle {
    public static void main(String[] args) {
        int n = 9, i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                if (i == 1 || i == 9 || j == 1 || j == 9 || i == j)
                    System.out.print(" *");
                else {
                    {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}