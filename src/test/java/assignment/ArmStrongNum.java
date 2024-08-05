package assignment;

public class ArmStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub......

		int number_5 = 153;
		int copy_of_number_5 = number_5;
		int sum = 0;
		int rem;

		while (number_5 > 0) {

			rem = number_5 % 10;
			sum = sum + (rem * rem * rem);
			number_5 = number_5 / 10;

		}

		if (sum == copy_of_number_5) {
			System.out.println("Given number is armstrong number");
		} else {
			System.out.println("Given number is not armstrong number");
		}

	
		
		
	}

}
