package Java_Programs;

import java.util.HashMap;
import java.util.Map;

public class DuplicateChar {
    public static void main(String[] args) {
        String str = "Bibhuprasadmishra";
        findDuplicatecharacters(str);
    }
    public static void findDuplicatecharacters(String str) {
        str = str.replaceAll("\\s", "");
        Map<Character, Integer> charCountMap = new HashMap<>();
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            if (charCountMap.containsKey(c)) {
                int count = charCountMap.get(c);
                charCountMap.put(c, count + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate Character::" + entry.getKey() + " "+entry.getValue());
            }
        }
    }
}
