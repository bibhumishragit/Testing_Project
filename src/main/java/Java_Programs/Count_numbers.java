package Java_Programs;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Count_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 2, 2, 4, 5, 6, 5, 15, 2, 1, 1, 9, 8, 9, 3, 2, 0, 7, 7, 8);
		int[] nums = {1, 2, 3, 4, 1, 2, 3, 4, 4, 4, 5, 5, 6, 67, 7, 7};
		int[] num1 = {12, 34, 1, 23, 4, 4, 4, 5, 5, 6, 67, 76, 732};
		findSquareRootInArray();
		consecutivesum();
		toptwofrequecy();
		matchstring();


		 /* //List functions
		 List<String> listcheck=new ArrayList<>(Arrays.asList("Mango","Banana","Apple"));
		 listcheck.add("Apple");
		 listcheck.add(" ");
		 listcheck.add("Avacado");
		 listcheck.add("chicoo");
		 listcheck.replaceAll(fruit->fruit.strip());
		 System.out.println("Replacing fruits to upper case::"+listcheck);
		 System.out.println("All the fruits::"+listcheck);
		 System.out.println("listcheck size is::"+listcheck.size());
		 listcheck.set(4,"Orange");
		 System.out.println("All the fruits updated::"+listcheck);
		 listcheck.remove(1);
		 listcheck.removeIf(fruit->fruit.contains(" ") || fruit.startsWith("A"));
		 System.out.println("After removal fruits are::"+listcheck);
		 Arrays.asList(12,34,1,23,4,4,4,5,5,6,67,7,7);
		//distinct numbers and repeating count
		 Set<Integer> distinct = new HashSet<>(list);
	        for (Integer s: distinct) {
				System.out.println(s + " is present in the list: " + Collections.frequency(list, s)+ "  times");
	        }
			System.out.println("Maximum no. in the list:::"+Collections.max(list));
			//Size of the distinct set
			System.out.println("Size of the list::"+distinct.size());
			//Maximum number in the array
			int max= Arrays.stream(num1).max().orElseThrow(() -> new IllegalArgumentException("Array is empty"));
			//Compare 2 different arrays
			System.out.println("Max number in the nums Integer Array::"+ max +" "+ Arrays.equals(nums,num1));
			//Make an array as distinct and sort that
			int[] dist=Arrays.stream(nums).distinct().toArray();
			dist=Arrays.stream(dist).sorted().toArray();
			System.out.println("Distinct number in nums array:::"+ Arrays.toString(dist));*/
	}

	//Find the Square root of the target
	public static void findSquareRootInArray() {
		int[] squares = {1, 28, 37, 42, 95, 66, 71, 8, 90, 10, 11, 12, 13, 14, 15, 16, 25, 36};
		int low = 0, high = squares.length - 1, target = 17;
		boolean found = false;
		while (low <= high) {
			int mid = low + high - low / 2;
			if (squares[mid] == target) {
				System.out.println("Square root of target::" + (int) Math.sqrt(squares[mid]));
				found = true;
				break;
			} else if (squares[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		if (!found) {
			System.out.println("::Square root of target isn't found::");
		}
	}

	//Find the consecutive numbers sum = target in the given array
	public static void consecutivesum() {
		int[] numbers = {1, 2, 4, 4, 5, 6, 5, 15, 2, 1, 1, 9, 8, 9, 3, 2, 1, 7, 7, 8};
		int[] num = Arrays.stream(numbers).distinct().sorted().toArray();
		System.out.println("Distinct sorted array is::" + Arrays.toString(num));
		int start = 0, target = 18;
		boolean sums = false;
		while (start < num.length - 2) {
			int sum = num[start] + num[start + 1] + num[start + 2];
			if (sum == target) {
				System.out.println("The consecutive numbers sum is as target are:::" + num[start] + "," + num[start + 1] + "," + num[start + 2]);
				sums = true;
				break;
			}
			start++;
		}
		if (!sums) {
			System.out.println("There are no 3 consecutive numbers sum is as target");
		}
	}

	public static void toptwofrequecy() {
		int[] toptwo = {12, 12, 12, 1, 33, 44, 33, 43, 12, 14, 33, 44, 55, 55, 93};
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : toptwo) {
			//get the values from the array and put into Map and count the occurrence
			map.put(num, map.getOrDefault(num, 0) + 1);
			//System.out.println("Printing the Hash Map:::"+map);
		}
		//Put the map into a list and sort in ascending order
		List<Map.Entry<Integer, Integer>> sortedList = new ArrayList<>(map.entrySet());
		//System.out.println("Printing the List before sorting::"+sortedList);
		sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));
		System.out.println("Printing the List after sorting with the frequency in descending order::"+sortedList);
		for (int i = 0; i < Math.min(2, sortedList.size()); i++) {
			Map.Entry<Integer, Integer> entry = sortedList.get(i);
			System.out.println("The number: " + entry.getKey() + " Repeated times::" + entry.getValue());
		}
	}

	public static void matchstring() {
		String[] arr = {"Apple", "Banaba", "Bana", "bonaza", "bamboo", "Banaaa" };
		String matchword = "Banana";
		for (String words : arr) {
			if (words.length() != matchword.length()) continue;
			int count = 0;
			for (int i = 0; i <= words.length() - 1; i++) {
				if (!(matchword.toLowerCase().charAt(i) == words.toLowerCase().charAt(i))) {
					count++;
				}
			}
			if (count == 4) {
				System.out.println("There is a exactly 4 character  mismatch and the Word is:::"+words);
			}
		}
	}
}
