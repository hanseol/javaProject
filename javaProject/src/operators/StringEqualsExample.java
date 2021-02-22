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
		
		//³í¸®¿¬»êÀÚ 
		
		int result = 8;
		String str = "";
		if(result%2==0) {
			str="Â¦¼ö";
			System.out.println(str);
		}
		else {
			str = "È¦¼ö";
			System.out.println(str);
		}
		
		str = (result%2==0) ? "Â¦¼ö" : "È¦¼ö";
		System.out.println(str);
	}
}
