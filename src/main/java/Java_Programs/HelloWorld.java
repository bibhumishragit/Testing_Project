package Java_Programs;

import java.util.Arrays;
import java.util.Collections;

class HelloWorld {

    //sort based on defined index in array
	public static void sortbyindex(int[] array) {
		//Arrays.parallelSort(array, 0, array.length);
        Arrays.parallelSort(array, 0, 8);
        System.out.print("Sorted array for the given index::");
		for(int num:array){
            System.out.print(num+" ");
        }
	}
	public static void ascendingsort(int[] array) {
		Arrays.sort(array);
		System.out.print("Sorted array in ascending order is::");
		for(int num:array){
            System.out.print(num+" ");
        }
	}
	public static void descendingsort(int[] array) {
		/*for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {

				int temp=array[i];
				array[i]=array[j];
				array[j]=temp;

				array[i]=array[i]+array[j];
				array[j]=array[i]-array[j];
				array[i]=array[i]-array[j];
			}
		}*/
		System.out.print("The Array in descending order is::");
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
		//Arrays.sort(new int[][]{array}, Collections.reverseOrder());
		/*for(int num:array) {
			System.out.print(num+" ");
		}*/
	}
	
    public static void main(String[] args) {
    	int[] array={2,1,9,3,50,28,19,10,23,52,56,34,20,54,12,43};
    	sortbyindex(array);
    	System.out.println();
    	ascendingsort(array);
    	System.out.println();
    	descendingsort(array);
    	}
}