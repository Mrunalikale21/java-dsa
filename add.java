import java.util.*;

public class add {
    public static void main(String args[]){
       // int sum = 0;
        //for(int i= 1; i<11; i++){
          //  sum=sum+i;
        //}
        //System.out.println(sum);
    
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n= sc.nextInt();
    int sum = 0;
        for(int i= 1; i<=n; i++){
           sum=sum+i;
        }
        System.out.println(sum);
    }
    
}
