package Java_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Input : Big black bug bit a big black dog on his big black nose
//Output: big - 2
        //black -3
public class DuplicateWords {
    public static void main(String[] args) {
        String str = "Big black bug bit a big black dog on his black nose";
        //findDuplicatewords(str);
        duplicatewords(str);
    }
    public static void findDuplicatewords(String str){
        String[] words=str.split(" ");
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word:words) {
            //word=word.replaceAll("[^a-zA-Z0-9]","");
            System.out.println("Words from the Array::"+word);
            word=word.toLowerCase();
            if(wordCountMap.containsKey(word)){
                int count=wordCountMap.get(word);
                wordCountMap.put(word,count+1);
            }
            else {
                wordCountMap.put(word,1);
            }
        }
        for(Map.Entry<String,Integer>entry:wordCountMap.entrySet()){
            if(entry.getValue()>1){
                System.out.println("Duplicate word::"+entry.getKey()+" - "+ entry.getValue());
            }
        }
    }
    public static void duplicatewords(String input){
        String[] inputarr=input.toLowerCase().split("\\s+");
        Map<String, Integer> newhashmap= new HashMap<>();
        for(String words:inputarr){
            newhashmap.put(words,newhashmap.getOrDefault(words,0)+1);
        }
        System.out.println(newhashmap);
        for(Map.Entry<String,Integer> en:newhashmap.entrySet()){
            if(en.getValue()>1){
                System.out.println("The word::"+en.getKey()+" Appeared::"+en.getValue()+"times");
            }
        }
    }
}