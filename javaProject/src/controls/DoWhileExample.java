package controls;

import java.lang.System; //java에서 기본적으로 사용가능하도록 되어있음.
import java.util.Scanner; //package가 다르기 때문에 선언해 주어야 사용 가능.

public class DoWhileExample {
	public static void main(String[] args) {
		// System.in.read();
		// Scanner.readLine();
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		System.out.println("값을 입력 : ");
		String str = scn.nextLine();
		System.out.println("입력한 값은 : " + str);

		do {
			System.out.println(">");
			str = scn.nextLine();
			System.out.println(">>>" + str);
		} while (!str.equals("q")); //str == "q" (x) : String 클래스 변수는 참조 타입 변수

//		do {
//			System.out.println(">");
//			str = scn.nextLine();
//			System.out.println(">>>" + str);
//			if (!str.equals("q")) {
//				break;
//			}
//		} while (run);

		System.out.println("end of program.");
	}
}
