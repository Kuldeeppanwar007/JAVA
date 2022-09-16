package IfElse_switch;
import java.util.Scanner;

public class Pswrd {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("enter the number :");
            int password = sc.nextInt();
            sc.close();
            if(password==1234)
            System.out.println("password is correct");
            else
            System.out.println("wrong password");


    
}
}
