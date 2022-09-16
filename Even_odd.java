import java.util.Scanner;
public class Even_odd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number :");
        int X = sc.nextInt();
        sc.close();

        if(X%2==0){
            System.out.println("even");

        } else{
            System.out.println("odd");
            
        }
    }
    
}




