import java.util.Scanner;
public class With_perimeter {

    public  void add(int a, int b){
       
        System.out.println("enter two num :");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        System.out.println(a+"+"+b+"="+(a+b));
    }
    public static void main(String[] args) {
         With_perimeter saloni = new  With_perimeter();
        saloni.add('a','b');
    }
}
    

