package IfElse_switch;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        System.out.println("Enter the numbers :");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        if (x % y == 0) {
            System.out.println("division possible");
        } else {
            System.out.println("division not possible!");
        }

    }
}
