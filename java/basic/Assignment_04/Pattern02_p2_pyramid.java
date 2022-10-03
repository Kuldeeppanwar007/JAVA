package Assignment_04;

public class Pattern02_p2_pyramid {
    public static void main(String[] args) {

        int i, j,k;
        for (i = 0; i <= 4; i++) {
            int alphabate = 65;
            for (j = 0; j <= i; j++) {
                System.out.print((char)(alphabate+j)+" " );
            }
            for (k = i-1; k>=0 ; k--) {
            
                System.out.print((char)(alphabate+k)+" ");

            }

            System.out.println();
        }
    }

}
