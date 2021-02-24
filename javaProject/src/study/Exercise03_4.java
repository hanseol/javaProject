package study;

public class Exercise03_4 {
	public static void main(String args[]) {
		
		System.out.println("3의 배수의 합: " + Sum(3));
		
	}
	public static int Sum (int x) {
		int sum = 0;
		
		for(int i = 1; i<=100; i++) {
			if (i % x == 0) {
				sum+=i;
			}
		}
		return sum;
	}
}
