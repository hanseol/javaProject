package operators;

public class StringEqualsExample {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "Hello";
		String str3 = new String("Hello");
		
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		
		//논리연산자 
		
		int result = 8;
		String str = "";
		if(result%2==0) {
			str="짝수";
			System.out.println(str);
		}
		else {
			str = "홀수";
			System.out.println(str);
		}
		
		str = (result%2==0) ? "짝수" : "홀수";
		System.out.println(str);
	}
}
