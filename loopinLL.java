public class loopinLL {
  int val;
  loopinLL head;
  loopinLL next;

  loopinLL(int x){
     val = x;
     next = null;

  }

  public boolean hasCycle(loopinLL head){
    palindromeLL hare = head;
    //fast pointer
    palindromeLL turtle = head; //slow pointer
  
     while(hare != null && hare.next != null){
      hare = hare.next.next;
      turtle = turtle.next;

      if(hare == turtle){
        return true;
      }
     }

     return false;
  }

}
