import java.util.Scanner;

class Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius value");
        double r = sc.nextDouble();
        sc.close();
        double area = 3.14 * r * r;
        double perimeter = 2 * 3.14 * r * r;
        System.out.println("area of circcle is :" + area);
        System.out.println("perimeter of circle is :" + perimeter);

    }

}
