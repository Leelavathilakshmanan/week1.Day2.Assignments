package week1.Day2;

//Build a logic to find the given string is palindrome or not

/*
 * Pseudo Code

 * a) Declare A String value as"madam"
 
 * b) Declare another String rev value as ""
 * c) Iterate over the String in reverse order
 * d) Add the char into rev
 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
 
 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
 */

public class Assignment2_Palindrome {

	public static void main(String[] args) {

		String value = "madam";
		String rev = "";

		String[] split = value.split(" ");
		for (int i = 0; i < split.length; i++) {
			rev = split[i];
		}
		System.out.println(rev);

		if (rev.equalsIgnoreCase(value) == true) {
			System.out.println("The given String " + value + " is PALINDROME");
		}

		else {
			System.out.println("The given String " + value + " is NOT A PALINDROME ");
		}
	}

}
