package Java_Programs;

import javax.crypto.spec.PSource;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class stringorder {
    public static void main(String[] args) {
        orderingstring();
    }
    public static void orderingstring(){
        String input="Test1 3by bi2bhu 5mishra pr4asad";
        Map<String, Integer> map=new HashMap<>();
        String[] inputwdno=input.split("\\s+");
        for(String words:inputwdno){
            String withoutno=words.trim().replaceAll("\\d+","");
            Matcher match= Pattern.compile("\\d+").matcher(words);
            if(match.find()){
                map.put(withoutno,Integer.parseInt(match.group()));
            }
        }
        String output=map.entrySet().stream().sorted(Map.Entry.comparingByValue()).map(Map.Entry::getKey).collect(Collectors.joining(" "));
        System.out.println(output);
    }
}
