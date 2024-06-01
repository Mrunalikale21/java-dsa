import java.util.*;

public class itinerary {

  public static String getStart(HashMap<String,String> tick){
    HashMap<String, String> revMap = new HashMap<>();

    for(String key : tick.keySet()){
      revMap.put(tick.get(key), key);

      //value of original map will be key, nd key will be value
 }
       for(String key : tick.keySet()){
        if(!revMap.containsKey(key)){  //if key is not contain in reverse map so it will be start point
          return key;
        }
       }
       return null;
  }
  
  public static void main(String[] args) {
    HashMap<String, String> tickets = new HashMap<>();
    tickets.put("chennai", "bengaluru");
    tickets.put("mumbai", "delhi");
    tickets.put("goa", "chennai");
    tickets.put("delhi", "goa");
   
    String start = getStart(tickets);
    while(tickets.containsKey(start)){
    System.out.print(start+"->");
    start = tickets.get(start);
  }
  System.out.println(start);
}
  
}
