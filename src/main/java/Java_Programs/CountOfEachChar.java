package Java_Programs;
import java.util.HashMap;
import java.util.Map;

public class CountOfEachChar {
    static String str="bibhu mishra";
    public static void main(String[] args) {
        count_char();
        count_word_char();
    }
    public static void count_char(){
        String str="bibhu mishra".replaceAll(" ","");
        HashMap<Character, Integer> hashmap= new HashMap<>();
        for(int i = str.length() - 1; i >=0; i--){
            if(hashmap.containsKey(str.charAt(i))) {
                int count = hashmap.get(str.charAt(i));
                hashmap.put(str.charAt(i), ++count);
            }
            else {
                hashmap.put(str.charAt(i),1);
                }
            }
        System.out.println(hashmap);
    }
    public static void count_word_char() {
        if (str.length()>0) {
            char[] words = str.replace(" ","").toCharArray();
            Map<Character, Integer> charcount = new HashMap<>();
            for(char c:words){
                charcount.put(c,charcount.getOrDefault(c,0)+1);
            }
            System.out.println(charcount);
            for(Map.Entry<Character,Integer>entry:charcount.entrySet()) {
                System.out.println("The characters::" + entry.getKey()+" appeared:: "+ entry.getValue());
            }
        }
    }
}