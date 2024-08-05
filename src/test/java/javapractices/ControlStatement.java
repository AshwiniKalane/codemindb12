package javapractices;

public class ControlStatement {

	public static void main(String[] args) {

		int number = 21;

		if (number >= 0) {
			System.out.println("number is positive = " + number);
		}

		if (number < 0) {
			System.out.println("number is negetive = " + number);
		}

		System.out.println("#####################################");

		if (number % 2 != 0) {
			System.out.println("Given number is odd = " + number);

		} else {
			System.out.println("Given number is even = " + number);
		}

		System.out.println("#####################################");

		float marks = 20;

		if (marks >= 35 && marks <= 50) {
			System.out.println("Your eligible for arts stream");
		} else if (marks > 50 && marks <= 65) {
			System.out.println("Your eligible for commerce stream");
		} else if (marks > 65 && marks <= 75) {
			System.out.println("Your eligible for science stream");
		} else if (marks > 75) {
			System.out.println("Your eligible for computer stream");
		} else {
			System.out.println("Sorry!! your not eligible for any stream, Please repeat 10th");
		}

	}

}

