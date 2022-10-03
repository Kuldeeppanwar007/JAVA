package Assignment_04;

public class Pattern04_mirror_rhobus_star {
    public static void main(String[] args) {
        int n = 9, i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 7; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }

}
