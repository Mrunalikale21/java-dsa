import java.util.*;

public class search {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        //input
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("Number to be searched : ");
        int x = sc.nextInt();

        //output
        for(int i=0; i<size; i++){
            if ( x == numbers[i]){
                System.out.println (" given no. found at index : " + i);
            }
}

         }

    }
    

