package Java_Programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sorting_Alphabetic {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="George";
		str=str.toLowerCase();
		String sortString=sortStringAlphabetic(str);
		System.out.println("Sorted characters:::"+ sortString);
	}
	public static String sortStringAlphabetic(String str){
		char[] charArray=str.toCharArray();
		Arrays.sort(charArray);
		return new String(charArray);
	}
}