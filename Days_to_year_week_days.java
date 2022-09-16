import java.util.Scanner;

public class Days_to_year_week_days {
    // public static int YEAR_DAYS = 365;
    // public static int WEEK_DAYS = 7;
    public static void main(String[] args) {
        int inputDays;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter days : ");
        inputDays = sc.nextInt();
        sc.close();

        int year = inputDays / 365;
        int remainDays = (inputDays % 365);
        int week =  remainDays / 7;
        int days = remainDays % 7;

        System.out.println("year ----> "+ year);
        System.out.println("week ----> "+ week);
        System.out.println("days ----> "+ days);
    }
}
