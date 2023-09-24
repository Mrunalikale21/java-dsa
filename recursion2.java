public class recursion2 {
    public static void printSum(int i , int n , int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        
        sum += i;
        printSum(i+1 , n , sum);
        System.out.println(i);
        //when we going up in memory stack we are printing sum
        //and when we are going down in memory stack we are printing our i
        
    }

    public static void main(String args[]){
        printSum( 1, 5 , 0 );
    }
    
}
