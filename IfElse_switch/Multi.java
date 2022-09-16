 package IfElse_switch;
 import java.util.Scanner;

 public class Multi{
     public static void main(String[] args) {
        System.out.println("Enter the numbers :");
    Scanner sc = new Scanner (System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    sc.close();

if(y % x== 0) {
        System.out.println("Multiplied!");
	} 
	else 
	{
        System.out.println("Not Multiplied!");
	}
	
	
}
    }

    

