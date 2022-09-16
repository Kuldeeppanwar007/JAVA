package IfElse_switch;
import java.util.Scanner;

public class Peri_triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        float  x= sc.nextFloat();
        System.out.println("enter the number:");
        float  z= sc.nextFloat();
        System.out.println("enter the number:");
        float  y= sc.nextFloat();
        float sum = x+y+z;
        sc.close();
        

        
        
        
        //25+15>35.........25+35>15......25+35+15.
       if(((x+y)>z) && ((y+z)>x) && ((x+z)>y))//triangle comdition/formula
        {  
        System.out.println("perimeter of these number is :"+ sum);

        
    }
    
}
}
