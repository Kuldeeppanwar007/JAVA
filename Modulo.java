import java.util.Scanner;
public class Modulo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter numbers :");
        int no = sc.nextInt();
        int no1 = sc.nextInt();
        sc.close();

        if(no%2==0&&no1%2==0){
            int sum = no+no1;
            int division = no/no1;
            System.out.println("sum of given no:"+sum);
            System.out.println("division of given no:"+division);

        } else if(no%2!=0 && no1%2!=0){
            int sub = no-no1;
            System.out.println("sub of given no :"+sub);
            
        }else if(no%2==0 && no1%2!=0){
            System.out.println("multiplication of given no :"+(no*no1));
    }else{
        System.out.println("condition notsatisfied");
        
    
}
}
}





