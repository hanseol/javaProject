package objects;

public class CalExample {
	public static void main(String[] args) {
		System.out.println(getSUM(40,50));
		System.out.println(getAverage(40,50));
		Student2 s = new Student2("박소연",87,92);
		showInfo(s);
	}
	
	public static void showInfo(Student2 st) {
		System.out.println("이름 : " + st.getName());
		System.out.println("합계점수: " + getSUM(st.getEng(), st.getMath()));
		System.out.println("평균점수: " + getAverage(st.getEng(), st.getMath()));
	}
	public static int getSUM(int num1, int num2) {
		int sum=num1 + num2;
		return sum;
	}
	public static double getAverage(int num1, int num2) {
		int sum = num1+ num2;
		double avg= sum/2.0;
		return avg;
	}
}
