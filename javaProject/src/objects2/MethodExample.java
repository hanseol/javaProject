package objects2;

import objects.Student;

public class MethodExample {
	public static void main(String[] args) {
		
		for(int i=0;i<args.length;i++) {
			System.out.println("매개값["+i+"]: "+args[i]);
		}
		
		Calculator cal = new Calculator();
		double result = cal.getArea(3.5);
		//double result2 = cal.getRact(2,3);
		double result2 = Calculator.getRect(2, 3);
		
		MethodExample me = new MethodExample();
		me.sum(10,20); //static이 아닐 경우, 인스턴스를 생성하고 사용가능.
		
		//sum(10,20); public static int : 정적으로 메모리에 저장. 인스턴스 생성을 하지 않아도 됨.
		
		Book b1 = new Book("","","",100);
		Student s1 = new Student();
		s1.run();
		s1.study();
		
	}
	
	public int sum(int a, int b) {
		return a+b;
	}
}
