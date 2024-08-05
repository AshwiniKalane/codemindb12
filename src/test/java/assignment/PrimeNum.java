package assignment;

public class PrimeNum {



		public static void main(String[] args) {

			PrimeNum pm = new PrimeNum();
			for (int j = 3; j <= 100; j++) {
				pm.testPrime(j);
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

	

