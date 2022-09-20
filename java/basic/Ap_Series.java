public class Ap_Series {
    public static void main(String[] args) {
        int term = 10;
        int diff =  4;
        int sum = 0;
        int j =1;
        for(int i =1 ; i<=term; i++){
            sum=sum+j;
            System.out.println(j);
            j=j+diff; 
        }
        System.out.println("sum of ap series :"+sum);
    
    }
    
}

    

