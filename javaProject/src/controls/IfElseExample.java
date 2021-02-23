package controls;

public class IfElseExample {
	public static void main(String[] args) {
		String grade;
		int score = 90;

		// if-else 구문이용.
		// 90점 이상 ->A, 80점 이상 ->B,70점 이상 ->C,그 외 ->F
		// 90점 이상 중에 95점 이상이면 A+
		/*
		if (score >= 90) {
			grade = "A";
			if (score >= 95) {
				grade = "A+";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85) {
				grade = "B+";
			}
		} else if (score >= 70) {
			grade = "C";
			if (score >= 75) {
				grade = "C+";
			}
		} else {
			grade = "F";
		}
		*/
		
		int result = score/10;
		//switch문에서 break가 없으면 순차적으로 진행하게 됨.;
		switch(result) {
			case 10:
				grade = "A+";
				System.out.println("점수 " + score + "는 " + grade + "입니다.");
				break;
			case 9:
				grade = "A";
				System.out.println("점수 " + score + "는 " + grade + "입니다.");
				break;
			case 8:
				grade = "B";
				System.out.println("점수 " + score + "는 " + grade + "입니다.");
				break;
			case 7:
				grade = "C";
				System.out.println("점수 " + score + "는 " + grade + "입니다.");
				break;
			default:
				grade = "F";
				System.out.println("점수 " + score + "는 " + grade + "입니다.");
				break;
		}

		// grade = (score >= 90) ? "A" : (score >=80) ? "B" : (score >=70) ? "C" : "D";

		//System.out.println("점수 " + score + "는 " + grade + "입니다.");
	}
}
