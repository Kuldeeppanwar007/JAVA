import java.util.Scanner;
public class PrintName {
    public static void myName(String myName){
System.out.println(myName);
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    sc.close();
    System.out.println(name);
   } 
}
