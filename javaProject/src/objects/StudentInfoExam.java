package objects;

public class StudentInfoExam {
	public static void main(String[] args) {
		
		StudentInfo s1 = new StudentInfo("홍길동",90,85);
		StudentInfo s2 = new StudentInfo("김길동",88,85);
		StudentInfo s3 = new StudentInfo("이길동",76,90);
		StudentInfo s4 = new StudentInfo();
		//s4.name ="최길동";
		s4.setName("최길동"); 
		//s4.eng = 40;
		s4.setEng(40); 
		//s4.math = 100;
		s4.setMath(100);
		//System.out.println(s4.math);
		System.out.println(s4.getMath());
		
		new StudentInfo();
		
		StudentInfo[] student = new StudentInfo[4];
		student[0]=s1;
		student[1]=s2;
		student[2]=s3;
		student[3]=s4;
		
		for(StudentInfo students : student) {
			students.viewInfo();
		}
	}
}
