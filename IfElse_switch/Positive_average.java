package IfElse_switch;
import java.util.Scanner;
public class Positive_average {
            public static void main(String[] args) {
            int a;
            int b;
            int c;
            int d;
            int e;
            int countP = 0;
            int sum = 0;
    
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
                sum+=a;
            }
            if (b >= 0){
    
                countP++;
                sum+=b;
            }
            if (c >= 0){
    
                countP++;
                sum+=c;
            }
            if (d >= 0){
    
                countP++;
                sum+=d;
            }
            if (e >= 0){
    
                countP++;
                sum+=e;
            }
            

                System.out.println("Number of positive numbers:"+countP );
                System.out.println("Average of positive numbers:"+sum / countP);
        }
    }
    

