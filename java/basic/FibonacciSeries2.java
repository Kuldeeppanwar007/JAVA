import java.util.Scanner;
public class FibonacciSeries2 {
    public static void main(String[] args) {
        int a =0;
        int b = 1;
        int c =0;
        int n;
        //int term=1;
        System.out.println("enter the max value");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        sc.close();
        while(c<=n){//term<=n
            System.out.println(c);
            a=b;
            b=c;
            c=a+b;
            //term++;
        }
        
    }
    
}
