package Java_Programs;

import java.util.Scanner;

public class count_words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence="This is java";
	
		String[] words=sentence.split(" ");
		int count=words.length;
		System.out.println("The count of words::"+count);
	}

}
