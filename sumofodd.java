import java.util.*;

//for given 1 to n numbers sum of odd numbers
public class sumofodd {
    public static void printSum(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i%2 != 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
        return;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        printSum(n);
    }
    
}
