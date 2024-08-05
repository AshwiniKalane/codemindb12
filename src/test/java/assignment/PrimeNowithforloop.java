package assignment;

public class PrimeNowithforloop {
	public static void main(String[] args) {

	int number = 17;
	boolean prime = true;

	for (int i = 2; i < number / 2; i++) {

		if (number % i == 0) {
			prime = false;
			break;
		}

	}

	if (prime) {
		System.out.println("Number is prime = " + number);
	} else {
		System.out.println("Number is not prime = " + number);
	}

	
}
}

