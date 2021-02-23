package controls;

public class WhileExample2 {
	public static void main(String[] args) {
		
		for(int i=2; i<=3; i++) {
		showResult(i);
		}
	}
	
	public static void showResult(int num) {
		int i=1;
		while(i<=9) {
		System.out.println(num + "*" + i + "=" + num*i);
		i++;
		}
		
//		while(true) {
//			if(i<=9) {
//				System.out.println(num + "*" + i + "=" + num*i);
//			}
//			i++;
//		}
	}
}
