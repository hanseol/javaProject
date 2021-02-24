package controls;

public class Morning0225 {

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 11; i <= 30; i++) {
			sum += i;
		}
		System.out.println(sum);

		sum = 0;

		int n1 = 11, n2 = 30;
		for (int i = n1; i <= n2; i++) {
			sum += i;
		}
		System.out.println(sum);

		System.out.println(getSum(n1, n2));
	} // end of main

	public static int getSum(int fromValue, int toValue) {
		int sum = 0;
		for (int i = fromValue; i <= toValue; i++) {
			sum += i;
		}
		return sum;
	} // end of getSum
}
