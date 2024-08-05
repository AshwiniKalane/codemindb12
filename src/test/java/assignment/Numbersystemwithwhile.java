package assignment;

public class Numbersystemwithwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num = 2;
		while (num <= 10) {
			int num2 = 1;
			while (num2 <= 10) {

				System.out.print(num * num2 + "\t");
				num2++;
			}
			num++;
			System.out.print("\n");
		}

	}

}
