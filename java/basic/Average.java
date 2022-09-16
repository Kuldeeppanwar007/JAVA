/*6. Write a program that accepts two item’s weight (floating points&#39; values )
and number of purchase (floating points values) and calculate the average
value of the items. 
Test Data :
Weight - Item1: 15
No. of item1: 5
Weight - Item2: 25
No. of item2: 4
Expected Output:
Average Value = 19*/
public class Average {
    public static void main(String[] args) {
      
    float weight1 = 15 ;
    float item1 = 5;
    float weight2 = 25;
    float item2 = 4 ;
    float average =(((weight1*item1)+(weight2*item2))/(item1+item2));

        System.out.println( "Average : "+ average);
        
    
        
    }

}
