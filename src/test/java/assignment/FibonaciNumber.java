package assignment;

public class FibonaciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1 = 0, num2 = 1;
		System.out.print(num1 + "\t" + num2 + "\t");

		for (int i = 1; i <= 8; i++) {

			int num3 = num1 + num2;
			System.out.print(num3 + "\t");

			num1 = num2;
			num2 = num3;

		}

		System.out.println();

	}

}
