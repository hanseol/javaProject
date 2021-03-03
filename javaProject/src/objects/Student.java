package objects;

public class Student {
		//속성(필드)
		String studentNo; // p20140350
		int grade;
		int math;
		int eng;
	
		// 생성자 : 필드값을 초기화
		public Student(){
			//System.out.println("생성자 호출");
			//필드 값을 초기화하지 않고 인스턴스만 만들겠다.
		}
		Student(String studentNo){
			this.studentNo = studentNo;
			//studentNo 값을 초기화해서 필드를 생성하겠다.
		}
		Student(int grade, int eng, int math){
			this.grade = grade;
			this.eng = eng;
			this.math = math;
		}
		//기능(메소드)
		public void study() {		
			System.out.println("공부중");
		}
		public void run() {
			System.out.println("운동중");
		}
		public void introduce() {
			System.out.println("학번: " + studentNo + ", 학년: " + grade + 
					", 영어" + eng + ", 수학: " + math);
		}
}
