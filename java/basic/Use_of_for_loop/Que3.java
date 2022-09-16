package Use_of_for_loop;

public class Que3 {
    public static void main(String[] args) {
        int num=0;
        System.out.println("enter the numbers:");
      
        for(int i=50;i<=99;i++ ){
            if(i%17!=0){
                num+=i;
            }
        }
        System.out.println(num);
    }
    
}
