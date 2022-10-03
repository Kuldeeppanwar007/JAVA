package Assignment_04;

public class Pattern06_cross_pattern {
    public static void main(String[] args) {
        int n = 10,i,j;
        for(i=1;i<=n;i++){
            for(j=0;j<=n;j++){
                if(i==j||i+j==n){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }System.out.println();
        }
    }
    
}
