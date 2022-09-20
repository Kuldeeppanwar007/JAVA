import java.util.Scanner;

class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius value");
    int r = sc.nextInt();
        sc.close();
        double area = 3.14 * r * r;//3.14
        double perimeter = 2 *3.14 * r ;
        System.out.println("area of circcle is :" + area);
        System.out.println("perimeter of circle is :" + perimeter);

    }

}
