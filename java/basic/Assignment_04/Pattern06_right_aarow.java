package Assignment_04;

public class Pattern06_right_aarow {
    public static void main(String[] args) {
        int n = 5, i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (j = n; j >= i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }for ( i = 1; i <= n; i++) {
            for ( j = n; j>=i; j--) {
                System.out.print("  ");
            }
            for ( j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
    
} 
}
}

