package controls;

public class ForExample {
	public static void main(String[] args) {
		//1~10까지 합계 , 짝수만 합계
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}
}
