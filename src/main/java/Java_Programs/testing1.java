package Java_Programs;

public class testing1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abc";
		String s2="abc";
		String s3="abc1";
		String s4=new String("abc");
		String s5=new String("abc");
		String s6=new String("abc1");
		 
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		System.out.println(s1.equals(s4));
		System.out.println(s4==s5);
		System.out.println(s3==s6);
		String s7=s1.concat(" "+s2);
		String s8=s1+" "+s6;
		System.out.println(s7);
		System.out.println(s8);
	}
}
