package IfElse_switch;
import java.util.Scanner;

public class Highest_value {
    public static void main(String[] myArgs) {
        System.out.println("Enter the numbers :");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        sc.close();

if (n1>=n2 && n1>=n3 && n1>=n4 && n1>=n5)//(a>c)
System.out.println("the greatest number is n1 :"+n1);
else  if (n2>=n1 && n2>=n3 && n2>=n4 && n2>=n5)//(b>d)
System.out.println("the greatest number is n2 :"+2);
else  if (n3>=n1 && n3>=n2 && n3>=n4 && n3>=n5)//(d>e)
System.out.println("the greatest number is n3 :"+n3);
else  if (n4>=n1 && n4>=n2 && n4>=n3 && n4>=n5)
System.out.println("the greatest number is n4 :"+n4);
else  if (n5>=n1 && n5>=n2 && n5>=n3 && n5>=n4)
System.out.println("the greatest number is n5 :"+n5);
else{
    System.out.println("invalid");
}







        
    }
    
}
