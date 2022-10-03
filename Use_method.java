public class Use_method {
    public int oddNum( int start,int end){
        int sum =0;
for(int i = start ; i<end; i++){
    if(i%2 !=0){
        sum = sum +i;
    }
}System.out.println(sum);
return 0;
    }
   public static void main(String[] args) {
Use_method summ = new Use_method();
summ.oddNum(1,5);
   } 
    
}
