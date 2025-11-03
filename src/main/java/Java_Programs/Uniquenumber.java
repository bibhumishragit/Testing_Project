package Java_Programs;
import java.util.ArrayList;
import java.util.Scanner;

	public class Uniquenumber {	

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayList<Integer> custom = new ArrayList<>();
	        int number;
	        boolean isUnique = true;
	        System.out.println("Enter a number: ");
	        number = sc.nextInt();
	        while (number > 0) {
	            int lastDigit = number % 10;
	            number = number / 10;
	            if (custom.contains(lastDigit)) {
	                isUnique = false;
	                break;
	            }
				custom.add(lastDigit);
	        }
	        if (isUnique) {
	            System.out.println("It is a unique number");
	        } else {
	            System.out.println("It is not a unique number");
	        }
	    }
	}
	