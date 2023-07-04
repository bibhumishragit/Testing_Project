package Java_Programs;
import java.util.HashMap;

public class CountOfEachChar {
    public static void main(String[] args){
    String str="bibhu mishra";
    HashMap<Character, Integer> hashmap= new HashMap<>();
    for(int i = str.length() - 1; i >=0; i--){
        if(hashmap.containsKey(str.charAt(i))) {
                int count = hashmap.get(str.charAt(i));
                hashmap.put(str.charAt(i), ++count);
            }
        else
            {
           hashmap.put(str.charAt(i),1);
             }
        }
        System.out.println(hashmap);
    }
}