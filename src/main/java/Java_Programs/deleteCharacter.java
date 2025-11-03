package Java_Programs;

public class deleteCharacter {
	public static void delcharacter() {
		String input="##abcd##efg#hijk###lmno#";
		char delchar='#';
		String result ="";

		String rein=checkchar(input,delchar);

		for(int i=0;i<rein.length()-1;i++) {
			if( rein.charAt(i)==delchar) {
				int reslen=result.length();
				result=result.substring(0, reslen-1);
				}
			else{
				result=result.concat(String.valueOf(rein.charAt(i)));
				}
			}
			System.out.println(result);
		}
		public static String checkchar(String input,char delchar) {
			String reinput = null;
			for (int m = 0; m < input.length() - 1; m++) {
				if (input.charAt(m) == delchar) {
					reinput = input.substring(m + 1);
				}
				else if(Character.isLetterOrDigit(input.charAt(m))){
					reinput=input.substring(m);
					break;
				}
			}
			return reinput;
		}
		public static void main(String[] args) {
		delcharacter();
		}
	}

