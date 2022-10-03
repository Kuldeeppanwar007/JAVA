package Assignment_04;

public class Pattern06_hollow_inverted_pyramid {
    public static void main(String[] args) {
        int n = 9, i, j, k;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (k = n; k >= i; k--) {
                if (i == 1 || k == n || k == i){
                    System.out.print(" *");
            } else{
                System.out.print("  ");
            }

        }
        System.out.println();
    }

    }
    
}
