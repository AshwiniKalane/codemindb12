package assignment;

public class PalindromForGivenString {

	public static void main(String[] args) {
		String S1 = "madam";
		String S2 = "";

		for (int i = S1.length() - 1; i >= 0; i--) {
			S2 = S2 + S1.charAt(i);

		}
		if (S1.equals(S2)) {
			System.out.println("Given string is palindrom " + S1);
		} else {
			System.out.println(S1 + "\n" + "Given sting is not palindrom " + S1);
		}
	}

}
