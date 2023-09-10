import java.util.*;

public class radius {
    public static double calculateCircumference(int r){
        double circumference =  6.26 * r ;
        return circumference;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        double circumference = calculateCircumference(r);
        System.out.println("Circumference is : "+ circumference);
    }
    
}
