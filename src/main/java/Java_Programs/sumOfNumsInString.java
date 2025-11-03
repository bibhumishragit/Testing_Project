package Java_Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



//Sum of integer values
public class sumOfNumsInString{
	static String name="V2i3v4ek";
	public static void main(String[] args) {
		/*String name="Bibhu12 Mishra23";
		Pattern pattern=Pattern.compile("\\d+");
		Matcher match=pattern.matcher(name);
		int sum=0;
		while(match.find()) {
			int number=Integer.parseInt(match.group());
			sum+=number;
		}
		System.out.println("Sum of numbers:::"+sum);*/
		sumof_numbers();
	}
	public static void sumof_numbers(){
		int sum=0;
		Pattern pattern=Pattern.compile("\\d+");
		Matcher matcher=pattern.matcher(name);
		while(matcher.find()){
			int num= Integer.parseInt(matcher.group());
			sum+=num;
		}
		System.out.println("The sum of numbers::"+sum);
	}
}