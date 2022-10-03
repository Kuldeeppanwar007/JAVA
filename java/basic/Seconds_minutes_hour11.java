import java.util.Scanner;
public class Seconds_minutes_hour11 {
    public static void main(String[] args) {
        int inputSeconds;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seconds : ");
        inputSeconds = sc.nextInt();
        sc.close();

        int hour = inputSeconds / 3600;
        int remainSeconds = (inputSeconds % 3600);
        int minutes =  remainSeconds/ 60;
        int seconds = remainSeconds % 60;

        System.out.println("hour ----> "+ hour);
        System.out.println("minutes ----> "+ minutes);
        System.out.println("seconds ----> "+ seconds);
    }
        
    }
    

