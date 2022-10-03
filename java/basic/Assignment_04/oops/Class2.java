package Assignment_04.oops;
import java.util.Scanner;
class Car {
    String model;
    int price;
    String color;
    int speed;
    void getdata(){//String model,int price ,  String color
        Scanner sc =new Scanner(System.in);
        System.out.println("enter model name");
        this.model=sc.next();
        System.out.println("ente price");
        this.price=sc.nextInt();
        System.out.println("enter color");
        this.color=sc.next();
        System.out.println("enter speed");
        this.speed=sc.nextInt();
        sc.close();
    }

void show(){
    System.out.println("model"+model);
    System.out.println("price"+price);
    System.out.println("color"+color);
    System.out.println("speed"+speed);
    

}
}

public class Class2 {
    public static void main(String[] args) {
        Car c1 = new Car ();
        //System.out.println("speed"+c1.speed);
        c1.getdata();
        c1.show();

        
    }
    
}

