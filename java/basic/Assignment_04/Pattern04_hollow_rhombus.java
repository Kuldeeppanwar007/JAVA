package Assignment_04;

public class Pattern04_hollow_rhombus {
    public static void main(String[] args) {
        int n = 9;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 7; j++) {
                if (i == 1 || j == 1 || i == n|| j == 7) {
                    System.out.print("  *");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

    }
}

    

