package IfElse_switch;
import java.util.Scanner;

public class P_n_e_o {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        
        if(num>=0){ //nested if
            System.out.println("positive");
              if(num%2==0) {
                System.out.println("even");
                }
                else 
                System.out.println("odd");
              } 
              else{ 
                       System.out.println("negative");
              }
    
    

    }
    
     }
    

