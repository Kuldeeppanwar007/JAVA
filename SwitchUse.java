import java.util.Scanner; 
    public class SwitchUse{
     public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter two no:");
                int no1 = sc.nextInt();
                int no2 = sc.nextInt();
                System.out.println("1: sum\n 2: sub\n 3: multi\n 4: division\n");
                int choice = sc.nextInt();
                sc.close();
     switch(choice){
        case 1:System.out.println("sum of given no :" +(no1 + no2));
    break;
        case 2: System.out.println("sub " +(no1-no2));
        break; 
        case 3: System.out.println("multi " +(no1*no2));
    break;
       case 4:    System.out.println("division"+ (no1/no2));
    break;
    default:  System.out.println("break"); 
     }
    }
    }
     
    
    

