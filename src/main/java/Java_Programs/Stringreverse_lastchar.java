package Java_Programs;

public class Stringreverse_lastchar {
	static String input="Bibhu Prasad Mishra";
	public static void main(String[] args) {
		reverse_lastcharacter();
		/*String s1="Bibhu Prasad Mishra";
		String[] words=s1.split("\\s+");
		for(int i=0;i<=words.length-1;i++) {
			//String s2=words[i];
			int len=words.length;
			System.out.println("length of words::"+len);
			//String s3=s2.substring(len-1, len) + s2.substring(0, len-1)+" ";
			String s3=words[i].toString().substring(len-1,len)+words[i].toString().substring(0,len-1)+" ";
			System.out.println("The string in reverse last character and rest in front:::::"+s3);
			System.out.println("rev Value::"+s3);
		}*/
	}

	public static void reverse_lastcharacter(){
		String[] inputwords=input.toLowerCase().split("\\s+");
		StringBuilder BR=new StringBuilder();
		for(String eachword:inputwords){
			int lengtheachword=eachword.length();
			String lastcharreversed=eachword.charAt(lengtheachword-1)+eachword.substring(0,lengtheachword-1);
			BR.append(lastcharreversed).append(" ");
		}
		System.out.println("The last character reversed sentence is::"+BR);
	}
}
