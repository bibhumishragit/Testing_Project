package Java_Programs;

public class lowerToupper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="TesTeR";
		String converted=convertedcase(s1);
		System.out.println("the Converted String::"+converted);
	}
		
		public static String convertedcase(String s1) {
		StringBuilder converted1=new StringBuilder();
		for(char c:s1.toCharArray()) {
			if(Character.isLowerCase(c)) {
				converted1.append(Character.toUpperCase(c));
			}
			else if(Character.isUpperCase(c)) {
				converted1.append(Character.toLowerCase(c));
			}
			else {
				converted1.append(c);
			}
			
		}
		return converted1.toString();
	}
		

}


