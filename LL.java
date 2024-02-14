public class LL {

  Node head;
  private int size;

  class Node{
    String data;
    Node next;
   

  Node(String data) {
    this.data = data;
    this.next = null;
    size++;
  }
}

//add - first
public void  addFirst(String data){
  Node newNode = new Node(data);
  if(head == null){
    head = newNode;
    return;
  }

  newNode.next = head;
  head = newNode;
} 

//add - last
public void addLast(String data){
  Node newNode = new Node(data);
  if(head == null){
    head = newNode;
    return;
  }


Node currNode = head;
while(currNode.next != null){
  currNode = currNode.next;
}

currNode.next = newNode;

}

//print
public  void printList(){
  if(head == null){
    System.out.println("list is empty");
    return;
  }

  Node currNode = head;
  while(currNode != null){
    System.out.print(currNode.data + " -> ");
    currNode = currNode.next;
  }

  System.out.println("Null");
}


//delete - first
public void deleteFirst(){
  if(head == null){
    System.out.println("The list is empty");
    return;
  }

  size--;
  head = head.next;
}

//delete last
public void deleteLast(){
  if(head == null){
    System.out.println("the list is empty");
    return;
  }

  size--;
  if(head.next == null){   //this will happen in case when only one node exists.
    head = null;
    return;
  }

  Node secondLast = head;
  Node lastNode = head.next;
  while(lastNode.next != null){
    lastNode = lastNode.next;
    secondLast = secondLast.next;
  }

  secondLast.next = null;
}

//to get size
public int getSize(){
  return size;
}


public static void main(String args[]){
  LL list = new LL();
  list.addFirst("a");
  list.addFirst("is");
  

  list.addLast("list");
  list.addFirst("this");
   list.printList();

   list.deleteFirst();
   list.printList();

   list.deleteLast();
   list.printList();

   System.out.println(list.getSize());
  
}
}
