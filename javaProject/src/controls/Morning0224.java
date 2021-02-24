package controls;

public class Morning0224 {

	public static void main(String[] args) {
		int engScore = 0, mathScore = 0;
		String result ;
		
		engScore = (int)(Math.random()*100)+1;
		System.out.println("영어점수 :" + engScore);
		
		mathScore = (int)(Math.random()*100)+1;
		System.out.println("수학점수 :" + mathScore);
		
		result = getAverage(engScore, mathScore);
		System.out.println("성적 : "+ result);

		
	}
	public static String getAverage(int n1, int n2) {
	
		double averScore = (n1 + n2)/2.0;
		String result ;
		
		if(averScore>=90) {
			result ="수";
		}else if(averScore>=80) {
			result ="우";
		}else if(averScore>=70) {
			result ="미";	
		}else {
			result ="가";
		}
		
		return result;
	}
}
