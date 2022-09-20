import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        int n;
         int remainder;
         int arm=0;
         int s;
         Scanner sc = new Scanner(System.in) ;
         System.out.println("enter any number");
        n = sc.nextInt();
        s=n;
        sc.close();
        while(n>0){
            remainder=n%10;
            arm=(remainder*remainder*remainder)+arm;
            n=n/10;
        }
        if(s==arm){
            System.out.println("armstrong");
        }else{
            System.out.println("not armstrong");
        }
    }
    
}
