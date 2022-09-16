


    import java.util.Scanner;
public class If{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the age :");
        int age = sc.nextInt();
        sc.close();

        if(age>18){
            System.out.println("eligible for vote");

        } else{
            System.out.println("not eligible");
            
        }
    }
    
}



