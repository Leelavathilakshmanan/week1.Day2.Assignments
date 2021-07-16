package week1.Day2;

//Check number of occurrences of a char (eg 'e') in a String

//	String str = "welcome to chennai";

// declare and initialize a variable count to store the number of occurrences

// convert the string into char array

//get the length of the array

// traverse from 0 till the array length 

// Check the char array has the particular char in it 

// if is has increment the count

// print the count out of the loop

public class Assignment2_CharOccurance {

	public static void main(String[] args) {

		String str = "Welcome to Chennai";
		int count = 0;
		System.out.println("The String: " + str);

		char[] strChar = str.toCharArray();

		for (int i = 0; i < strChar.length; i++) {

			if (strChar[i] == 'e') {
				count = count + 1;
			}
		}
		System.out.println("The character 'e' Occurance in the given string is : " + count);
	}

}
