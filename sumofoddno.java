import java.util.*;

//for any given numberss sum of odd number
public class sumofoddno {
    public static int calculateSum(int n){
        int sum = 0;
        for(int i=0; i<=n; i++){
            sum = sum + (2*i + 1);
        }
        return sum;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = calculateSum(n);
        System.out.println("Sum of all odd numbers is : "+ sum);
    }
    
}
