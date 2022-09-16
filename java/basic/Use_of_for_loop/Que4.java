package Use_of_for_loop;

public class Que4 {
    public static void main(String[] args) {
        System.out.println("enter the numbers:");

        for (int i = 25; i < 45; i++) {
            if (i % 7 == 2 || i % 7 == 3) {
                System.out.println(i);

            }
        }
    }
}
