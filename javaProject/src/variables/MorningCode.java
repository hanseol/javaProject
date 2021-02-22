package variables;

public class MorningCode {
	public static void main(String[] args) {
		int a, b;
		
		a = 30;
		b = 27;
		
		if(b>a) {
			System.out.println("나이가 좀 들었습니다.");
		}
		else if(b<a) {
			System.out.println("한창이네요.");
		}
		else {
			System.out.println("적정한 나이입니다.");
		}
	}
}
