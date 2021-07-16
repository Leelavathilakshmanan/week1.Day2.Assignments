package week1.Day2;

import java.util.Arrays;

/*
 * Pseudo Code
  
 *Declare a String 
	String text1 = "stops";
 *Declare another String
	String text2 = "potss"; 
 * a) Check length of the strings are same then (Use A Condition)
 * b) Convert both Strings in to characters
 * c) Sort Both the arrays
 * d) Check both the arrays has same value
 * 
 */

public class Assignment2_Anagram {

	public static void main(String[] args) {

		String text1 = "stops";
		String text2 = "potss";

		if (text1.length() == text2.length())

		{
			char[] text3 = text1.toCharArray();
			char[] text4 = text2.toCharArray();

			Arrays.sort(text3);
			Arrays.sort(text4);

//			for(int i=0; i < text3.length;i++)
//			{
//				System.out.println("charArray text3 [" +i +"]:" + text3[i]);	
//				}
//			
//			for(int i=0; i < text4.length;i++)
//			{
//				System.out.println("charArray text4 [" +i +"]:" + text4[i]);	
//				}
//			
//			System.out.println(Arrays.equals(text3, text4));
			if (Arrays.equals(text3, text4) == true) {
				System.out.println("The given string is Anagram");

			} else {
				System.out.println("The given string is not an Anagram");
			}
		}
	}

}
