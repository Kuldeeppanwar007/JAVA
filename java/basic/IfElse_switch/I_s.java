package IfElse_switch;

import java.util.Scanner;

public class I_s {

    public static void main(String[] args) {
       
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number a : ");
        int a = sc.nextInt();
        System.out.println("Enter the num b:");
        int b = sc.nextInt();
        System.out.println("Enter the num c :");
        int c = sc.nextInt();
        System.out.println("Enter the num d :");
       int d = sc.nextInt();
        System.out.println("Enter the num e :");
        int e = sc.nextInt();

        
        int sum = 0;

        if (a % 2 == 1)//if(a%2!=0)
            sum = sum + a;
         else if (b % 2 == 1)
            sum = sum + b;
        else if (c % 2 == 1)
            sum = sum + c;
       else if (d % 2 == 1)
            sum = sum + d;
        else if (e % 2 == 1)
            sum = sum + e;

        sc.close();
        System.out.println("sum of odd number is " + sum);

    }
}
