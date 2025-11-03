package Java_Programs;

public class Test_code {

	public static void main(String[] args) {
		String s1="hello java is a good platform independent programming language";
		String s2="bibhu";
		StringBuilder matching=new StringBuilder();
		StringBuilder remaining=new StringBuilder(s1);
		
		for(int i=0;i< s1.length();i++) {
			char c=s1.charAt(i);
			if(s2.contains(String.valueOf(c))) {
				matching.append(c);	
				remaining.deleteCharAt(remaining.indexOf(String.valueOf(c)));
			}
		}
		System.out.println("matching characters::"+matching);
		System.out.println("Remaining characters from String s1::"+remaining);
	}
}
