package Java_Programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Count_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Integer> list = Arrays.asList(1,2,2,4,5,6,5,5,2,1,1,9,8,9,3,2,0,7,7,8);
		 
	        Set<Integer> distinct = new HashSet<>(list);
	        for (Integer s: distinct) {
	            System.out.println(s + " is present in the list: " + Collections.frequency(list, s)+ "  times");
	        }
	    }
	}
