package assignment;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PrimeNumber p = new PrimeNumber();
		for (int j = 3; j <= 100; j++) {
			p.testPrime(j);
		}

	}

	public void testPrime(int number) {
		boolean prime = true;

		for (int i = 2; i <= number / 2; i++) {

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
