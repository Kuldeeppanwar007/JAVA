import java.util.Scanner;
public class Static_method {
    public static void add(){
        int a,b ;
        System.out.println("enter two numbers:");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        System.out.println(a+"+"+b+"="+(a+b));
    }
    public static void main(String[] args) {
        add();
    }
}
