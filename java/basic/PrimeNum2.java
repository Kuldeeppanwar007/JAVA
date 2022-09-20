public class PrimeNum2 {
    public static void main(String[] args) {
        int count;
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) 
                    count++;
                
             } if (count == 2) {
                    System.out.println(i);
                    total = total + 1;
                }
            }
            System.out.println("total numbers :" + total);
        }
    }


