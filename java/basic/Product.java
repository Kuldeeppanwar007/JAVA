import java.util.Scanner;
    public class Product{
        public static void main(String[] args) {
            int a,b;
            Scanner input = new Scanner(System.in) ; 
            System.out.println("enter a");
            a = input.nextInt();
            System.out.println("enter b");
           b = input.nextInt();
           input.close();
           int product= a*b;
           System.out.println("the sum of two numbers is :"+product);
        }
    }