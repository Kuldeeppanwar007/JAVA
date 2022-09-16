import java.util.Scanner;

public class Marksheet_ {
    public static void main(String[] args) {
        System.out.println("Enter the marks:");
        Scanner num = new Scanner(System.in);
        System.out.println("major1");
        int major1 = num.nextInt();
        System.out.println("major2");
        int major2 = num.nextInt();
        System.out.println("minor");
        int minor = num.nextInt();
        System.out.println("hindi");
        int hindi = num.nextInt();
        System.out.println("english");
        int english = num.nextInt();
        num.close();
        if (major1 > 44 && major2 > 44 && minor > 44 && hindi > 44 && english > 44) {
            System.out.println("congratulations you have passed");
        } else if (major1 > 44 && major2 > 44 && minor > 44 && hindi > 44 && english < 44) {
            System.out.println("atkt you have one chanced");
        } else if(major1 > 44 && major2 < 44 && minor > 44 && hindi < 44 && english > 44){
            System.out.println("you are failed");

        }
    }
}
