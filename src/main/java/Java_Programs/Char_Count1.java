package Java_Programs;

public class Char_Count1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Bibhu";
		int size=s.length();
		for(int i=0;i<size;i++){
			for(int j=0;j<=i;j++){
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
		for(int i=size-2;i>=0;i--){
			for(int j=0;j<=i;j++){
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}
	}
}
