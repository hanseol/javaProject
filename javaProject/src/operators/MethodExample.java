package operators;

public class MethodExample {
	public static void main(String[] args) {
		int result = 0;
		
		result = sum(10,20);
		System.out.println(result);
		
		result = minus(30,20);	
		System.out.println(result);
		
		result=multi(15,13);
		System.out.println(result);
		
		result=divide(30,12);
		System.out.println(result);
		
		printAge(25);
	}
	
	public static void printAge(int age) {
		System.out.println("나이는 : " + age + "입니다.");
	}

	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}

	public static int minus(int a, int b) {
		int result = a - b;
		return result;
	}

	public static int multi(int a, int b) {
		int result = a * b;
		return result;
	}

	public static int divide(int a, int b) {
		int result = a / b;
		return result;
	}
}
