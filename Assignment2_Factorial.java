package week1.Day2;

/*Goal:Find the factorial of a given number
 * input:5
 * output:5*4*3*2*1=120
 */
public class Assignment2_Factorial {

	public static void main(String[] args) {
		// Declare your input as 5

		// Declare an integer variable fact as 1

		int input = 5, fact = 1;

		/*
		 * Iterate from 1 to your input(tip:using loop) within the loop:Multiply with
		 * the iterator variable (Tip:Assign it to the fact variable
		 */

		for (int i = 1; i <= input; i++) {
			fact = i * fact;

		}

		// print factorial

		System.out.println("The factorial value of " + input + " is :" + fact);
	}

}
