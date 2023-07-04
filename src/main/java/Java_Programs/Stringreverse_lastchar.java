package Java_Programs;

public class Stringreverse_lastchar {
	public static void main(String[] args) {
		String s1="Bibhu Prasad Mishra";
		String words[]=s1.split(" ");
		
		String s4;
		for(int i=words.length-1;i>=0;i--) {
		
			String s2=words[i];
			//System.out.println("the words in array::"+ s2);
		
			int len=s2.length();
			String s3=s2.substring(len-1, len) + s2.substring(0, len-1);
			System.out.println("The string in reverse last charcter and rest in front:::::"+s3);
			s4=s3+" ";
			System.out.println("rev Value::"+s4);
		}
	}

}
