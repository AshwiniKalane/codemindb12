package assignment;

public class NumberSystemPrograms {

	public static void main(String[] args) {

		// 2*1 ,2*2,2*3
		// 3*1...

		for (int i = 2; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print(i * j + "\t");
			}

			System.out.println();
		}
}
}
