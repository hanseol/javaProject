package myapp.score;

public class Student {
	private String name;
	private int korean;
	private int math;
	private int englihs;
	
	public Student() {
		
	};
	public Student(String name, int korean, int math, int englihs) {
		this.name = name;
		this.korean = korean;
		this.math = math;
		this.englihs = englihs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEnglihs() {
		return englihs;
	}
	public void setEnglihs(int englihs) {
		this.englihs = englihs;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", korean=" + korean + ", math=" + math + ", englihs=" + englihs + "]";
	}
	
}
