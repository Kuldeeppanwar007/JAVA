package Assignment_04;

public class Pattern05_invertedPyramid {
    public static void main(String[] args) {
        int n = 11, i, j, k;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (k = n; k >= i; k--){
                System.out.print(" *");
            }System.out.println();
        }
    }
    
}
