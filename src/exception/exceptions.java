package exception;

public class exceptions {

	// public static void main(String[] args) {

	public static void login() {
		System.out.println("login");
	}

	public static void main(String args[]) {
		try {
			int[] rollnumber = { 10, 3, 1, 3, 11, 3, 45 };
			System.out.println(rollnumber[8] + "kkkk");
		}

		catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(e);
			int[] rollnumber = { 10, 3, 1, 3, 11, 3, 45 };
			System.out.println(rollnumber[4] + "lll");
		} finally {
			System.out.println("final code");
		}
		login();

	}
}
