package controls;

public class WhileExample2 {
	public static void main(String[] args) {
		showResult(5);
	}
	
	public static void showResult(int num) {
		int i=1;
//		while(i<=9) {
//		System.out.println(num + "*" + i + "=" + num*i);
//		i++;
//		}
		while(true) {
			System.out.println(num + "*" + i + "=" + num*i);
			i++;
			if(i>=10) {
				break;
			}
		}
	}
}
