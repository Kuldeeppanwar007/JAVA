import java. util. Scanner;
public class String2 { 
    public static void main(String[] args) {
        System.out.println("what is your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next() ;
        System.out.println("\nhello \n"  + name  +   "\nhave a good day");
        sc.close();
    }
    
}
