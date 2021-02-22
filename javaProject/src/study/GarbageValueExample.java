package study;

public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i=0; i<5; i++) {
			var1++; //byte타입이지만 단항연산자이므로 자기 타입을 그대로 유지.
			//var1 = var1+1; //컴파일에러
			var2++;
			System.out.println("var1 : " + var1 + "\t" + "var2: " + var2);
		}
	}
}
