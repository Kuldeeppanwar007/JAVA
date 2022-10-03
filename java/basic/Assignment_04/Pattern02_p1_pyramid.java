package Assignment_04;

public class Pattern02_p1_pyramid {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 2*i-1; j++) {
                if(j <= i)
                System.out.print(" " + j);
                else
                System.out.print(" " + ((2*i)-j));


            }
          

            System.out.println();
        }
    }

}
