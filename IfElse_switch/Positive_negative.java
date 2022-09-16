package IfElse_switch;

import java.util.Scanner;

public class Positive_negative {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        int e;
        int countP = 0;
        int countN = 0;


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number a : ");
        a = sc.nextInt();
        System.out.println("Enter the num b:");
        b = sc.nextInt();
        System.out.println("Enter the num c :");
        c = sc.nextInt();
        System.out.println("Enter the num d :");
        d = sc.nextInt();
        System.out.println("Enter the num e :");
        e = sc.nextInt();
        sc.close();

        if (a >= 0){

            countP++;
        }
        else
            countN++;
        if (b >= 0)
            countP++;
        else
            countN++;
        if (c >= 0)
            countP++;
        else
            countN++;
        if (d >= 0)
            countP++;
        else
            countN++;
        if (e >= 0)
            countP++;
        else
            countN++;
            System.out.println("Number of positive numbers:"+countP );
            System.out.println("Number of negative numbers:"+countN);
    }
}
