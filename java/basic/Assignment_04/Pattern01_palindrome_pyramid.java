package Assignment_04;

public class Pattern01_palindrome_pyramid {
    public static void main(String[] args) {
        int n = 5;
        int odd = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= (n - 1); j++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                odd = odd + 1;
                System.out.print(odd + " ");

            }
            for (int j = 2; j <= i; j++) {
                odd=odd-1;
                System.out.print(odd + " ");
            }
            System.out.println();
        }
    }
}
