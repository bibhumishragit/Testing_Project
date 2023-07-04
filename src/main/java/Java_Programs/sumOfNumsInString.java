package Java_Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//String name="V2i3v4ek";

//Sum of integer values
public class sumOfNumsInString{
	public static void main(String[] args) {
		String name="Bibhu12Mishra23";
		Pattern pattern=Pattern.compile("\\d+");
		Matcher match=pattern.matcher(name);
		int sum=0;
		while(match.find()) {
			int number=Integer.parseInt(match.group());
			sum+=number;
		}
		System.out.println("Sum of numbers:::"+sum);
	}
}