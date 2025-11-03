package Java_Programs;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Sj4fs6sdk2md9sc1kf3ls0vd43ff7";
		extractnum(s1);
		extractnos(s1);
	}
	
	public static void extractnum(String s1) {
		StringBuilder num=new StringBuilder();
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			if(Character.isDigit(c))
			{
				num.append(c);
			}
			/*else if(num.length()>0) {
				System.out.println(num.toString());
				num.setLength(0);
			}*/
		}
		if(num.length()>0) {
			System.out.println(num.toString());
		}
	}

	public static void extractnos(String input){
		Matcher match= Pattern.compile("\\d+").matcher(input);
		List<String> sb= new ArrayList<>();
		while(match.find()){
			sb.add(match.group());
		}
		if(sb.size()>0){
			System.out.println("The numbers present in the string::"+sb);
		}
	}
}
