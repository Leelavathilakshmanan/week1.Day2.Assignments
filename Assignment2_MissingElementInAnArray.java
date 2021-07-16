package week1.Day2;

import java.util.Arrays;

public class Assignment2_MissingElementInAnArray {

	public static void main(String[] args) {
		// Here is the input
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		// sort the array
		Arrays.sort(arr);
		// loop through the array(start i from arr[0] till the length of the array)
		for (int i = 0; i < arr.length; i++) {
			// check the iterator variable is not equal to the array values respectively
			if ((i + 1) != arr[i]) {
				/*
				 * print the number once printed break the iteration
				 */
				int miss = i + 1;
				System.out.println("The missing element in an array is :" + miss);
				break;
			}
		}

	}

}
