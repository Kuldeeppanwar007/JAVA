import java.util.Scanner;
public class Hcf_gcd {
    public static void main(String[] args) {
        int g=0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        for(int i =1;i<=a;i++){
            if(a%i==0 && b%i==0){
                g=i;
                
            }
        }
        System.out.println(g);
    }
    
}
