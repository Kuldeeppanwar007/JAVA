
public class Lp {

    int name;
    static int n2;

    static void myname() {

        System.out.println("i am static mathod of loop class");
    }

    void speak() {
        System.out.println("i am speaking " + name);
    }

    void bark() {
        System.out.println(name + " is barking too laud");
    }

    public static void main(String[] args) {
        System.out.println(" i am gadhi");
        myname();
        Lp s = new Lp();
        s.name = 255;
        s.speak();
        s.bark();

        Lp k = new Lp();
        k.name = 100;
        k.bark();

        System.out.println("-------------->");
        s.speak();
        s.bark();

    }
    

}
