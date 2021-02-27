package study;

import java.util.Scanner;

public class ScoreProgram {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		int[][] students = null;
		int studentNum = 0;

		while (run) {

			System.out.println(" ------------------------------------------------------------------");
			System.out.println("| 1.학생수 2.점수입력 3.리스트 4.조희 5.영어최고점 6.합계최고 7.수학평균점이상 9.종료 |");
			System.out.println(" ------------------------------------------------------------------");
			System.out.print("선택 > ");
			int menu = scn.nextInt();

			if(students!=null&&menu==2) {
				System.out.println("이미 입력 했습니다.");
				continue;
			}
			if (menu == 1) {
				// 1.학생수 입력 받아서
				if(studentNum!=0) {
					System.out.println("이미 입력 했습니다.");
					continue;
				}
				System.out.print("학생수 > ");
				studentNum = scn.nextInt();
			} else if (menu == 2) {
				// 학생 번호에 따라 영어, 수학 점수를 저장하세요.
				students=saveScores(studentNum);
			} else if (menu == 3) {
				// 2.에서 입력한 값의 리스트를 학생번호 - 영어 / 수학 점수의 순으로 보여주는 코드 작성하세요.
				for (int i = 0; i < studentNum ; i++) {
					System.out.println("학생정보 - 번호:" + students[i][0] + ", " 
										+ "영어:" + students[i][1] + ", " 
										+ "수학:" + students[i][2]);
				}
			} else if (menu == 4) {
				// 3.학생번호를 입력하면 학생의 영어, 수학점수(또는 합계접수와 평균점수)를 보여주는 기능을 작성하세요.
				System.out.print("찾고자 하는 학생번호 입력> ");
				int findNo = scn.nextInt();

				for (int i = 0; i < studentNum ; i++) {
					if (findNo == students[i][0]) {
						System.out.println("학생정보 - 번호:" + students[i][0] + ", " 
											+ "영어:" + students[i][1] + ", "
											+ "수학:" + students[i][2]);
					}
				}
			} else if (menu == 5) {
				highEngScore(students); // 4. 영어점수가 가장 높은 학생번호,점수 출력
			} else if (menu == 6) {
				sumEngMathScore(students); // 5. 합계점수가 가장 높은 학생번호, 평균 출력
			} else if (menu == 7) {
				//students[][2]
				int sum=0;
				for(int i=0; i<students.length;i++) {
					sum += students[i][2];
				}
				double avg = (sum*10/students.length)/10.0;
				System.out.println("평균 점수:" + avg);
				for(int i=0;i<students.length;i++) {
					if(avg<students[i][2]) {
						System.out.println("학생번호:" + students[i][0] 
										+ "수학점수:" + students[i][2]);
					}
				}
				// 6. 수학점수가 수학평균점수 이상인 학생의 번호와 수학점수를 보여주도록 코드를 작성하세요.
			} else if (menu == 9) {
				run = false;
			}
		} // end of while
		System.out.println("프로그램 종료");
	}
	
	public static int[][] saveScores(int studentNum){
		
		int studentInfo[][] = new int[studentNum][3]; //학생번호[0],영어점수[1],수학점수[2],점수합[3]
		Scanner scanner = new Scanner(System.in);
		
		int i = 0;
		while (true) {
			System.out.print("학생번호>> ");
			studentInfo[i][0] = scanner.nextInt();
			System.out.print("영어점수> ");
			studentInfo[i][1] = scanner.nextInt();
			System.out.print("수학점수> ");
			studentInfo[i][2] = scanner.nextInt();
			
			i++;
			if (i == studentInfo.length) {
				break;
			}
		} //end of while
		
		return studentInfo;
	}
	
	public static void highEngScore(int[][] students) {
		
		int max = 0;
		int who = 0;
		for (int i = 0; i < students.length ; i++) {
			if (max < students[i][1]) {
				max = students[i][1];
				who = students[i][0];
			}
		}
		System.out.println("영어최고점> 학생번호: " + who + ", 영어: " + max);
	}
	
	public static void sumEngMathScore(int[][] students) {
		
		int stuNum = students.length;
		
		int max = 0, who = 0;
		int sum[] = new int[stuNum];
		for (int i = 0; i < stuNum; i++) { // 영어, 수학 점수 더하기.
			for (int j = 1; j < 3; j++) { 
				sum[i] += students[i][j];
			}
			if (max < sum[i]) {
				max = sum[i];
				who = i ;
			}
		}
		System.out.println("학생번호 : " + students[who][0] + " 평균점수: " + sum[who]/2.0);
	}
	
	public static int sumMathScores(int[][] students) {
		int stuNum = students.length;
		int sumMath = 0;
	
		for(int i=0;i<stuNum;i++) {
			sumMath+=students[i][2];
		}
	 return sumMath;
	}
	
	public static int sumEngScores(int[][] students) {
		int stuNum = students.length;
		int sumEng = 0;
	
		for(int i=0;i<stuNum;i++) {
			sumEng+=students[i][1];
		}
	 return sumEng;
	}
	
	
}
