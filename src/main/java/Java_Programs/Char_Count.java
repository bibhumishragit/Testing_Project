package Java_Programs;

import java.util.Scanner;

public class Char_Count {

	public static void main(String[] args) {
		String s="Bibhu Prasad Mishra";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character:::");
		char c=sc.next().charAt(0);
		
		int count=0;
		char arr[]=s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==c) {
				count++;
			}
		}
		System.out.println("Count of each character :::::"+count );
	}

}
