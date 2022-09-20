import java.util.Scanner; 
public class SwapNum {
    public static void main(String[] args) {
        int a,b,t;//10 20
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        a = sc.nextInt();//
        b = sc.nextInt();//
        t=a;  //t=10
        a=b;   //a=20
        b=t;   //b=10
        sc.close();
        System.out.println(a+" "+b);

        
        
    }
    
}
