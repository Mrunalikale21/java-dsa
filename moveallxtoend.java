public class moveallxtoend {
    public static void moveAllX(String str, int idx , int count , String newString){
        if(idx == str.length()){
            for(int i = 0; i<count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        
         char currChar = str.charAt(idx);
        if(currChar == 'x' ){
            count++;
            moveAllX(str, idx+1, count , newString);
        }else{
            newString += currChar; //newstring mai add honge baki ke character
            moveAllX(str, idx+1, count, newString);
        }
    }

    public static void main(String args[]){
        String str = "axbcxxd";
        moveAllX( str , 0 , 0 , "");
    }
}
