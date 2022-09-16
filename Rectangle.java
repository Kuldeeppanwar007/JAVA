import java.util.Scanner;

    public class Rectangle{
           public static void main(String[]args){
          int l;
          int b;
          int a;
          int p;

       Scanner sc = new Scanner (System.in);
       System.out.println("enter lenth");
       l=sc.nextInt();
       System.out.println("enter breadth");
       b=sc.nextInt();
       sc.close();
       a=l*b;
       p=2*(l+b);
       System.out.println("area of Rectangle "+a);
       System.out.println("perimeter of Rectangle "+p);

       

    
           }
       }
        
