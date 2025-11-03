package Java_Programs;

import java.util.*;

public class firstOccurance {
	static String s1 = "Developer";

	public static void main(String[] args) {
		//char target='e';
		/*Scanner input = new Scanner(System.in);
		System.out.print("Please Enter a character:::");
		//char target=input.nextLine();
		char target = input.next().charAt(0);
		if(s1.contains(String.valueOf(target))){
			int index = s1.indexOf(target);
			String result = s1.substring(0, index) + s1.substring(index + 1);
			System.out.println("The rest characters:::" + result);
		}
		else{
			System.out.println("Entered character doesn't present in the word");
		}
		indexes_occurance(s1);*/
		//remove_secondoccurnce();
		minPartitions();
	}

	public static void indexes_occurance(String input) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter an amazing character:::");
		String target = sc.nextLine();
		//StringBuilder result = new StringBuilder();
		if (input.contains(target)) {
				String result2 = input.replaceAll(target, "");
				System.out.println("The result::" + result2);
			}
		}
		//Remove the 2nd Occurrence of a character
	public static void remove_secondoccurnce(){
		String input="Bibhu Prasad Mishra".toLowerCase().replaceAll("\\s+","");
		char[] inputchararr=input.toCharArray();
		Scanner inputchar=new Scanner(System.in);
		System.out.print("Please Enter a character:::");
		char target=inputchar.next().charAt(0);
		int count=0;
		for(int i=0;i<inputchararr.length;i++) {
			if (inputchararr[i] == target) {
				count++;
				if (count == 2) {
					String result = input.substring(0, i) + input.substring(i + 1);
					System.out.println("The 2nd instance of entered character is removed and the rest:::" + result);
				}
			}
		}
	}

	public static void minPartitions() {
		String input = "82734";
		int maxDigit = 0;
		for (char c : input.toCharArray()) {
			int digit = c - '0';
			if (digit > maxDigit) {
				maxDigit = digit;
			}
			// Early exit if we hit 9 — can't go higher
			if (maxDigit == 9) break;
		}
		System.out.println("Minimum deci-binary partitions needed: " + maxDigit);
	}
}