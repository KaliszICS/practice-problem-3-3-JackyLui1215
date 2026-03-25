/**
 * File: Else if
 * Author: Mr. Kalisz
 * Date Created: March 25, 2026
 * Date Last Modified: March 25, 2026
 */


import java.util.Scanner;

class Notes {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//else if
		int num;
		System.out.print("Input an integer: ");
		num = input.nextInt();

		if (num == 5) {
			System.out.println("5");
		}
			//between if and else, i can put as many else if's as i want
		else if (num > 3) { //this can only run when the if/else if's above are false
			//num > 3 && num != 5
			//num > 3 && !(num == 5)
			System.out.println("greater than 3 and not 5");
		}
		else if (num > 1) { //num > 1 && num != 5 && num <= 3
			//num > 1 && num <= 3
			//2 or 3
			System.out.println("1");
		}
		else { //num <= 3 && num <= 1
			//num <= 1
			System.out.println("not 5, not 3 and not 1");
		}

		//DONT DO THIS
		if (num > 5) {
			System.out.println("greater than 5");
		}
			//Don't write code here.  IT will make else if and else disassociate with the original if.
		else if (num > 7) { //num <= 5 && num > 7 - impossible conditions
			//unreachable else if
			System.out.println("Greater than 7");
		}
		else {
			System.out.println("else");
		}

		//order of if's and else ifs
		//more specific to less specific
		//no code between else if

	}
}
