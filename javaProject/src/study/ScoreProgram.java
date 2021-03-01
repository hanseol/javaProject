package study;

import java.util.Scanner;

public class ScoreProgram {

	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		int[][] students = null; //참조할 배열 객체가 없다면 배열 변수는 null 값으로 초기화 될 수 있다.
		int studentNum = 0;

		while (run) {
			System.out.println(" ------------------------------------------------------------------");
			System.out.println("| 1.학생수 2.점수입력 3.리스트 4.조희 5.영어최고점 6.합계최고 7.수학평균점이상 9.종료 |");
			System.out.println(" ------------------------------------------------------------------");
			System.out.print("선택 > ");
			int menu = scn.nextInt();

			if((studentNum!=0 && menu==1)||(students!=null && menu==2)) {
				System.out.println("이미 입력 했습니다.");
				continue;
			}else if(students==null && ( menu==3 || menu==4 || menu==5 || menu==6 || menu==7)) {
				System.out.println("입력된 정보가 없습니다.");
				continue;
			}else if(studentNum==0 && menu==2) {
				System.out.println("학생 수를 먼저 입력하세요.");
				continue;
			}
			
			switch(menu) {
			case 1 :
				System.out.print("학생수 > ");
				studentNum = scn.nextInt();	
				break;
			case 2 :
				students = saveScores(studentNum); 
				break;
			case 3 :
				for (int i = 0; i < studentNum; i++) {
					System.out.println("학생정보 - 번호:" + students[i][0] + ", " 
										+ "영어:" + students[i][1] + ", " 
										+ "수학:" + students[i][2]);
				}
				break;
			case 4 :
				System.out.print("찾고자 하는 학생번호 입력> ");
				int findNo = scn.nextInt();
				int cnt =0;

				for (int i = 0; i < studentNum; i++) {
					if (findNo == students[i][0]) {
						System.out.println("학생정보 - 번호:" + students[i][0] + ", " 
											+ "영어:" + students[i][1] + ", " 
											+ "수학:" + students[i][2]);
						cnt++;
					}
				}
				
				if(cnt==0) {
					System.out.println("일치하는 학생이 없습니다.");
				}
				break;
			case 5 :
				highEngScore(students);
				break;
			case 6 :
				sumEngMathScore(students);
				break;
			case 7 :
				aboveEverage(students);
				break;
			case 9 :
				run = false;
				break;
			default :
				System.out.println("잘 못 누르셨습니다.");
			}
		} // end of while
		scn.close();
		System.out.println("프로그램을 종료합니다.");
	}

	// 학생 번호에 따라 영어, 수학 점수를 저장.
	public static int[][] saveScores(int studentNum) {

		int studentInfo[][] = new int[studentNum][3];
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
		}
		return studentInfo;
	}

	//영어점수가 가장 높은 학생번호,점수 출력
	public static void highEngScore(int[][] students) {

		int max = 0;
		int who = 0;
		for (int i = 0; i < students.length; i++) {
			if (max < students[i][1]) {
				max = students[i][1];
				who = students[i][0];
			}
		}
		System.out.println("영어최고점> 학생번호: " + who + ", 영어: " + max);
	}

	//합계점수가 가장 높은 학생번호, 평균 출력
	public static void sumEngMathScore(int[][] students) {

		int stuNum = students.length;

		int max = 0, who = 0;
		int sum[] = new int[stuNum];
		for (int i = 0; i < stuNum; i++) { 
			for (int j = 1; j < 3; j++) { //student[][1]: 영어점수 student[][2]:수학점수
				sum[i] += students[i][j];
			}
			if (max < sum[i]) {
				max = sum[i];
				who = i;
			}
		}
		System.out.println("학생번호 : " + students[who][0] + " 평균점수: " + sum[who] / 2.0);
	}

	//수학점수가 수학평균점수 이상인 학생의 번호와 수학점수를 보여주도록 코드를 작성하세요.
	public static void aboveEverage(int[][] students) {
		int stuNum = students.length;
		int sum = 0;
		for (int i = 0; i < stuNum; i++) { //수학점수 합계 저장
			sum += students[i][2];
		}
		double avg = (sum * 10 / stuNum) / 10.0; //수학점수 평균 계산
		System.out.println("평균 점수:" + avg);
		for (int i = 0; i < stuNum; i++) {
			if (avg <= students[i][2]) { 
				System.out.println("학생번호: " + students[i][0] +", " + "수학점수: " + students[i][2]);
			}
		}
	}
}
