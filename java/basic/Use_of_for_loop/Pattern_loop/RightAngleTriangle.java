package Use_of_for_loop.Pattern_loop;

public class RightAngleTriangle {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == 3 || j == 4)
                    System.out.print(" *");
            }
            System.out.println();
        }
    }
}
