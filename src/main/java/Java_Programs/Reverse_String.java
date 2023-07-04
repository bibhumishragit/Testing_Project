package Java_Programs;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original="Bibhu Mishra";
		String Reverse="";
		int length=original.length();
		for(int i=length-1;i>=0;i--){
		Reverse=Reverse+original.charAt(i);
		}
		System.out.println("Reverse string of the original:::::::" + Reverse);
	}

}
