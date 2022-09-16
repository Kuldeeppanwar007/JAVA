package Use_of_for_loop.Pattern_loop;

public class Empty_rectangle {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                if (  j == 1 || i==5 || i==j) {
                    System.out.print(j+" ");
                } else {
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
}
