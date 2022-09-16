import java.util.Scanner; 
public class Switch{
 public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int hey = sc.nextInt();
            sc.close();
 switch(hey){
    case 1:System.out.println("hello");
break;
    case 2: System.out.println("namste");
break;
    case 3: System.out.println("bonjour");
break;
    default:  System.out.println("not hey"); 
 }
}
}
 
