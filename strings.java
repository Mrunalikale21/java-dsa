import java.util.*;

public class strings {
    public static void main(String args[]){
        //concatenation
        String firstName = "tony";
        String lastName = "stark";
        String fullName = firstName + "@" + lastName;
        System.out.println(fullName.length());

        //charAt
        for(int i=0; i<fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }

        //compare
        //1 s1>s2 : +ve value
        //2 s1 == s2 : 0
        //3 s1<s2 : -ve value
        if(firstName.compareTo(lastName) == 0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        //substring
        String sentence = "Mrunali Kale";
        String name1 = sentence.substring(8 , sentence.length());
        String name2 = sentence.substring(5);
        System.out.println(name1);
        System.out.println(name2);

        
    }
}
