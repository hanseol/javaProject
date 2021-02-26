package references;

import java.util.Scanner;

public class Exercise09_5 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null; 
		Scanner scn = new Scanner(System.in);
		
		while(run) {
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("선택>");
		
			int selectNo = scn.nextInt();
			
			if(selectNo !=1 && scores ==null) {
				System.out.println("학생수를 입력하세요");
				System.out.println();
				continue;
			}
			if(selectNo==1) {
				System.out.print("학생수 >");
				studentNum=scn.nextInt();
				scores = new int[studentNum];
			}else if(selectNo==2) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"] : ");
					scores[i]=scn.nextInt();
				}
			}else if(selectNo==3) {
				for(int i=0;i<scores.length;i++) {
					System.out.println("scores["+i+"] : " + scores[i]);
				}
			}else if(selectNo==4) {
				
				int max = maxScores(scores);
				int sum = sumScores(scores);
				double avg = avgScores(sum,studentNum) ;
				
				System.out.println("최고 점수:" + max);
				System.out.println("평균 점수 : " + avg);
				
			}else {
				System.out.println("종료");
				
				run = false;
			}
		}
	} //end of main
	
	public static int maxScores(int[] scores) {
		int max = 0;
		for (int i=0; i<scores.length;i++) {
			if(max<scores[i]) {
				max = scores[i];
			}
		}
		return max;
	}
	public static int sumScores(int[] scores) {
		int sum =0;
		for(int i=0;i<scores.length;i++) {
			sum+=scores[i];
		}
	return sum;
	}
	
	public static double avgScores(int sum, int studentNum) {
		double avg = (double)sum / studentNum ;
		
		return avg;
	}
}
