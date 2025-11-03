package Java_Programs;

import java.util.HashMap;
import java.util.Map;

public class testing {

	public void detectDuplicateCharacter(String str, Character ch) {
        System.out.println("Str : " + str);
        System.out.println("Ch : " + ch);
        int j = 0;
        Map<String,Integer> stringMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if(ch != str.charAt(i)){
                j = i;
                break;
            }
        }
        str = str.substring(j);

        String s = deleteChars(str, "", '#');

        System.out.println("RESULT : "+s);
    }

    private String deleteChars(String original, String result, Character ch) {
        if (original.length() <= 0) {
            return result;
        }
        int dupCharCount = 0;
        int j = 0;
        int idx = original.indexOf(ch);
        String subStr = original.substring(0, idx);
        for (int i = idx; i < original.length(); i++) {
            if (ch == original.charAt(i)) {
                dupCharCount++;
            } else {
                j = i;
                break;
            }
        }
        result = result + subStr.substring(0, subStr.length() - dupCharCount);
        if (j == 0) {
            original = "";
        } else {
            original = original.substring(j);
        }
        return deleteChars(original, result, ch);
    }

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Bibhu##prasad##";
		char ch='#';
		testing obj=new testing();
		obj.detectDuplicateCharacter(str, ch);
	}
}
