package Java_Programs;

import java.util.Scanner;

public class Swapvalue_wdoutvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for a::");
		int a=sc.next().charAt(0);
		System.out.println("Enter the value for b::");
		int b=sc.next().charAt(0);
		
		//int a=5;
		//int b=10;
		
		a=a+b;
		b=a-b;
		//a=a-b;
		System.out.println("The value of a::"+a +"\n" +"The value of b::"+b);

	}

}
