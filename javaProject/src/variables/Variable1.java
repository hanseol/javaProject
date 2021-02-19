package variables;

public class Variable1 {
	public static void main(String[] args) {
		
		byte b1 = 10;
		byte b2 = 10;
		short s1 = 10;
		int i1 = 10;
		long l1 = 10;
		
		byte result1 = (byte)(b1 + b2);
		
		int result2 = s1 + b1;
		
		int result3 = i1 + s1;
		
		long result4 = l1 + b1;
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);

	}

}
