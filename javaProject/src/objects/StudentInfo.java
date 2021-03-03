package objects;

public class StudentInfo {
	private String name;
	private int math;
	private int eng;
	//잘 못 된 값이 입력되었을 때 메소드에서 처리방법을 정하기 위해서 private으로 선언
	//동일한 클래스 내에서만 접근가능, 외부클래스에서 접근 불가.
	StudentInfo() {

	}

	StudentInfo(String name, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.math = math;
	}

	void viewInfo() {
		System.out.println("이름 : " + name + ", 영어점수: " + eng + ", 수학점수: " + math + ", 합계: " + (eng + math));
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEng(int eng) {
		if (eng < 0) {
			this.eng = 0;
		} else {
			this.eng = eng;
		}
	}

	public void setMath(int math) {
		if (math < 0) {
			this.math = 0;
		} else {
			this.math = math;
		}
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getEng() {
		return this.eng;
	}
	
	public int getMath() {
		return this.math;
	}
	
	

}
