package generics;

public class CompareMethodExample {
	public static void main(String[] args) {
		Pair<Integer, String> p1 = new Pair<>(1,"사과");
		Pair<Integer, String> p2 = new Pair<Integer, String>(1,"사과");
		boolean result1 = Utils.compare(p1, p2);
		if(result1) {
			System.out.println("논리적으로 동등한 객체입니다.");
		}else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
		
		Pair<String, String> p3 = new Pair<>("user1","홍길동");
		Pair<String, String> p4 = new Pair<String, String>("user2","사과");
		boolean result2 = Utils.<String,String>compare(p3, p4);
		if(result2) {
			System.out.println("논리적으로 동등한 객체입니다.");
		}else {
			System.out.println("논리적으로 동등하지 않는 객체입니다.");
		}
		
		int result3 = Utils.compare(10,20);
		System.out.println(result3);
		
		int result4 = Utils.compare(4.5,3);
		System.out.println(result4);
		
	}
}
