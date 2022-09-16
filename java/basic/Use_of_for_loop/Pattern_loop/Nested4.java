package Use_of_for_loop.Pattern_loop;

public class Nested4 {
    public static void main(String[] args) 
    { for(int i=1; i<=5;i++)
        { for(int j=1 ; j<=i; j++)
            {
                System.out.print("*");//ln-
            }System.out.print("\n");
        }
        for(int i=1; i<=5;i++)
        { for(int j=5 ; j>=i; j-- ){
            System.out.print("*");
        }System.out.println();
        
    
}}
    
}
