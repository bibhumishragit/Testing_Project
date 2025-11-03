package Java_Programs;

import java.util.Scanner;

public class format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number::");
		int s=sc.nextInt();
		for(int i=1;i<=s;i++) {
			for(int j=1;j<=i;j++) {
					System.out.print(j);
				}
				System.out.print("\n");
			}
		}
}
