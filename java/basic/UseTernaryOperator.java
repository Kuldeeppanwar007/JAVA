public class UseTernaryOperator {
    public static void main(String[] args) {
        int a = 25;
        int b = 50;
        int c = 30; //
                          // a      :     b
       int num =(a>b)?((a>c )? a : c) : ((b>c) ? b:c );
        System.out.println(num);
        
    }
    
}
