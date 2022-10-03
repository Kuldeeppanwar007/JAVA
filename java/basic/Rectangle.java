import java.util.Scanner;

    public class Rectangle{
           public static void main(String[]args){
          
       Scanner sc = new Scanner (System.in);
       System.out.println("enter lenth");
       int l=sc.nextInt();
       System.out.println("enter breadth");
       int b=sc.nextInt();
       sc.close();
      int  a=l*b;
       int p=2*(l+b);
       System.out.println("area of Rectangle "+a);
       System.out.println("perimeter of Rectangle "+p);

       

    
           }
       }
        
