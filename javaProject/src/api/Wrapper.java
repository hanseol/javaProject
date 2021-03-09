package api;

public class Wrapper {
	public static void main(String[] args) {
		BoxingUnBoxingExample();
		AutoBoxingExample();
		StringToPrimitiveValueExample();
		ValueCompareExample();
	}

	public static void BoxingUnBoxingExample() {
		// Boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer("200");
		Integer obj3 = Integer.valueOf("300");

		// Unboxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();

		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

	public static void AutoBoxingExample() {
		// 자동 Boxing
		Integer obj = 100;
		System.out.println("value: " + obj.intValue());
		// 대입 시 자동 Boxing
		int value = obj;
		System.out.println("value: " + value);
		// 연산 시 자동 Unboxing
		int result = obj + 100;
		System.out.println("result: " + result);
	}
	
	public static void StringToPrimitiveValueExample() {
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: "+value1);
		System.out.println("value1: "+value2);
		System.out.println("value1: "+value3);
	}
	
	public static void ValueCompareExample() {
		System.out.println("[-128~127 초과값일 경우]");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("==결과: " + (obj1 == obj2));
		System.out.println("언박싱후 ==결과: " +(obj1.intValue() == obj2.intValue()));
		System.out.println("equals() 결과: " + obj1.equals(obj2));
		System.out.println();
		
		System.out.println("[-128~127 범위값일 경우]");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("==결과: " + (obj3==obj4));
		System.out.println("언박싱후 ==결과: " + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과: " + obj3.equals(obj4));
	}
}
