package study;

public class Exercise06_4 {

	public static void main(String[] args) {
		exercise06();
	}

	public static void exercise06() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
