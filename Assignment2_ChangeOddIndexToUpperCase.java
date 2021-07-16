package week1.Day2;

/*
Pseudo Code

* Declare String Input as Follow
 
* String test = "changeme";

* a) Convert the String to character array

* b) Traverse through each character (using loop)

* c)find the odd index within the loop (use mod operator)

* d)within the loop, change the character to uppercase, if the index is odd else don't change
 
*/

public class Assignment2_ChangeOddIndexToUpperCase {

	public static void main(String[] args) {

		String test = "changeme";
		char[] testarr = test.toCharArray();
		System.out.println("Changing odd index to uppercase:");
		for (int i = 0; i < testarr.length; i++) {
			if (i % 2 != 0) {
				char a = Character.toUpperCase(testarr[i]);
				System.out.println(a);
			}
		}

	}

}
