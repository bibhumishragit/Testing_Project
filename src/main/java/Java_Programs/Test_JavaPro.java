package Java_Programs;

import java.util.Scanner;

public class Test_JavaPro {
	
	public static void fpart(String s,int size) {
		for(int i=0;i<=size-1;i++){
			for(int j=0;j<=i;j++){
				System.out.print(s.charAt(j));
				}
			System.out.println();
		}
	}
	public static void spart(String s, int size) {
		for (int m=size-1;m>=0;m--){
            for (int k=0;k<m;k++){
            	System.out.print(s.charAt(k));
            }
            System.out.println();
        }
	}
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
         System.out.println("Enter a String to print the pattern:::");        
	     String s=sc.next();
         int size = s.length();
	     fpart(s,size);
		 spart(s,size);
	}
}
