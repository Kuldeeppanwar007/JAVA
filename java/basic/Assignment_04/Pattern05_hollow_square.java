package Assignment_04;

public class Pattern05_hollow_square {
    public static void main(String[] args) {
        for(int i =1;i<=9;i++){
            for(int j =1;j<=8;j++){
                if(i==1||j==8|| i==9 || j==1 ){
                System.out.print("  *");
            }else{
                System.out.print("   ");
            }
            
        }
        System.out.println();
        
    }
    
}
}
