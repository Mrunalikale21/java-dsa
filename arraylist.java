import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements
        list.add(0);
        list.add(1);
        list.add(2);

        System.out.println(list);

        //get elementss
        int element = list.get(0);
        System.out.println(element);

        //add element in betwween add element at particular index
        list.add(1,1); //element at index 1 and element 1
        System.out.println(list);

        //set element to change element at given position
        list.set(0,5);
        System.out.println(list);

        //delete element
        list.remove(2);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //loop
        for(int i =0; i<list.size(); i++){
            System.out.print(list.get(i));
        }

        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);

       

    }
}
