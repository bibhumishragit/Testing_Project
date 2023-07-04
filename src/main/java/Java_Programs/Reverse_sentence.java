package Java_Programs;

public class Reverse_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original="Bibhu Prasad Mishra";
		String words[]=original.split(" ");
		//String word[]=original.toCharArray();
		String Reverse="";
		for(int i=words.length-1;i>=0;i--) {
			Reverse=words[i]+" ";
			System.out.print(Reverse);
			}
		}

	}


