 package IfElse_switch;
import java.util.Scanner;

public class Switch_month {

    public static void main(String[] args) {
       System.out.println("Enter:");
   Scanner sc = new Scanner (System.in);
   int months = sc.nextInt();
   sc.close();
   

   switch(months){
     case 1: System.out.println("january");
           break;
   
    case 2: System.out.println("january"); 
           break;
    
    case 3:System.out.println("february");
           break;
    
    case 4:System.out.println("march"); 
           break;
    
    case 5: System.out.println("april");
           break;
    
    case 6:System.out.println("may"); 
           break;
  
    case 7: System.out.println("june");
           break;

     case 8: System.out.println("august");
           break;

     case 9: System.out.println("september");
           break;
           
     case 10: System.out.println("october");
           break;

     case 11: System.out.println("november");
           break;

      case 12: System.out.println("decemebr");
           break;
           
   default :System.out.println("not a month");
}
   
   
    
      
}


    
}
