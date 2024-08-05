package javapractices;

public class NestedIF {

	public static void main(String[] args) {
		int accountBalnce = 6000;
		final int PIN = 1234;
		int availbleCurrenciesInMachine = 100;
		int withdrawAmount = 2000;

		if (PIN == 1234) {
			if (withdrawAmount < accountBalnce) {
				if (availbleCurrenciesInMachine == 100) {
					accountBalnce = accountBalnce - withdrawAmount;
					System.out.println(accountBalnce);
				} else {
					System.out.println("Mentioned currencies are not avalble in ATM");
				}
			} else {
				System.out.println("Account balance insufficient");
			}

		} else {
			System.out.println("Wrong pin");
		}

	}

}
