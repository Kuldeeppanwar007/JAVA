package Use_of_for_loop;

public class SquareCube {
    public static void main(String[] args) {
        System.out.println("number\t\t\tsquare\t\t\tcube");
        for(int i =0;i<=10;i++){
            System.out.println(i+"\t\t\t"+(int)Math.pow(i,2)+"\t\t\t"+(int)Math.pow(i,3));
        }
    }
    
}
