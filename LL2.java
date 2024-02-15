import java.util.*;

class LL2 {

  public static void main(String args[]){
  LinkedList<String> list = new LinkedList<String>();

  list.addFirst("a");
  list.addFirst("is");
  System.out.println(list);

  list.addLast("list");
  System.out.println(list);  //in linked list if we didint mention then by defult node will add at last

  System.out.println(list.size());

  for(int i =0; i<list.size(); i++){
    System.out.print(list.get(i) + " -> ");
  }
  System.out.println("null");

  list.removeFirst();
  System.out.println(list);

  list.removeLast();
  System.out.println(list);

  list.remove(2);
  System.out.println(list);
}

  
}

