package Assignment_04;

public class Pattern05_hollow_pyramid {
    public static void main(String[] args) {
        int n = 9, i, j, k;
        for (i = 1; i <= n; i++) {
            for (j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                if (i == n || k == 1 || k == i){
                    System.out.print(" *");
            } else{
                System.out.print("  ");
            }

        }
        System.out.println();
    }

}
}
