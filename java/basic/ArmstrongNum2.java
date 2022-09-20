import java.util.Scanner;

public class ArmstrongNum2 {
    public static void main(String[] args) {
        int n;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
        n = sc.nextInt();
        sc.close();
        int z = n;
        while (z > 0) {
            count = count + 1;
            z = z / 10;
        }
        System.out.println("number of digit =" + count);
        z = n;
        int remainder;
        int sum = 0;
        while (z > 0) {
            remainder = z % 10;
            int multi = 1;
            for (int i = 1; i <= count; i++) {
                multi = multi * remainder;
            }
            sum = sum + multi;
            z = z / 10;
        }
        if (sum == n) {
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }

}
