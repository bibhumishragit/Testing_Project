package Java_Programs;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test_programs {
    public static void main(String[] args) {
        String sentence = "Bibhu Prasad Mishra is exploring Java";
        Character firstUnique = getFirstNonRepeatedChar(sentence);
        if (firstUnique != null) {
            System.out.println("First non-repeated character: " + firstUnique);
        } else {
            System.out.println("No unique character found.");
        }
    }
    public static Character getFirstNonRepeatedChar(String input) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        for (char ch : input.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                ch = Character.toLowerCase(ch); // Optional: case-insensitive
                countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return null;
    }

}
