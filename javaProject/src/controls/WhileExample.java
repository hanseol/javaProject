package controls;

public class WhileExample {
	public static void main(String[] args) {
		int i = 1, sum = 0;
//
//		while (i <= 10) {
//			sum = sum + i;
//			i++;
//		}
//		System.out.println(sum);
//		i=1;
		while(true) {
			sum += i;
			i++;
			if(i++ >= 10) {
				break;
			}
//			i++;
		}
		System.out.println(sum);
		
	}
}
