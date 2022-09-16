public class UseTernaryOperator {
    public static void main(String[] args) {
        int a = 25;
        int b = 50;
        int c = 30; //
        int num;      // a      :     b
        num=(a>b)?(a>c ? a : c) : (b>c ? b:c );
        System.out.println(num);
        
    }
    
}
