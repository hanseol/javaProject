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
				int sum = 0;
				int max =0;
				double avg = 0;
				for(int i=0;i<scores.length;i++) {
					if(max<scores[i]) {
						max=scores[i];
					}
				}
				
				for(int i=0;i<scores.length;i++) {
					sum+=scores[i];
				}
				avg = sum / studentNum ;
				
				System.out.println("최고 점수:" + max);
				System.out.println("평균 점수 : " + avg);
			}else {
				if(selectNo==5) {
					System.out.println("종료");
				}else {
					System.out.println("범위를 벗어났습니다. 1~5중 선택 해 주세요.");
				}
				run = false;
			}
		}
	}
}
