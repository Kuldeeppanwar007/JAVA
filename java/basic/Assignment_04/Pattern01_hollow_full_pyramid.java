package Assignment_04;

public class Pattern01_hollow_full_pyramid {
    public static void main(String[] args) {

        int j;
        for (int i = 1; i <= 5; i++) {
            for (j = i; j <= 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (  k == 1 ||  k == i || i == 5) {
                    System.out.print(" " + k);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
