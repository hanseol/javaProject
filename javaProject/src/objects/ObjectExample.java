package objects;

public class ObjectExample {
	public static void main(String[] args) {
		Student student1 = new Student(); //힙 영역에 객체 생성. this : student1
		student1.studentNo = "s23456";
		student1.grade = 2;
		student1.eng = 80;
		student1.math = 85;
		student1.study();
		student1.run();
		student1.introduce();
	
		Student student2 = new Student("s23457"); //this : student2
		student2.grade = 3;
		student2.eng = 76;
		student2.math = 88;
		student2.study();
		student2.run();
		student2.introduce();
	
		Student student3 = new Student(4,70,80);
		student3.studentNo = "p23459";
		student3.study();
		student3.run();
		student3.introduce();
	}
}
