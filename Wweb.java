import java.util.Scanner;
public class Wweb {
    public static void main(String[] args) {
        System.out.println("enter the website");
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        sc.close();
        if(website.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a Commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian website");
        }
    
    }
    
}
