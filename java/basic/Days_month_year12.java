import java.util.Scanner;
public class Days_month_year12 {
    public static void main(String[] args) {
        int inputDays;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days : ");
        inputDays = sc.nextInt();
        sc.close();

        int year = inputDays / 365;
        int remainDays = (inputDays % 365);
        int month =  remainDays/ 30;
        int days = remainDays % 30;

        System.out.println("year ----> "+ year);
        System.out.println("month ----> "+ month);
        System.out.println("days ----> "+ days);
    }
}
    
