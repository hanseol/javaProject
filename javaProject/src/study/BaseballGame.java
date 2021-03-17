package study;

import java.util.Scanner;

public class BaseballGame {
	public static void main(String[] args) {
		// (1~9)랜덤으로 숫자 3개를 받아와서 배열에 넣기
		// 3s가 나올때까지 입력받기-입력값 배열에 넣기
		boolean run = true;
		int[] num = new int[3];
		int menu = 0;
		Scanner scn = new Scanner(System.in);
		String value = "";
		int cnt = 0;
		int ball = 0, strike = 0;
		
		while (run) {
			System.out.println("1.게임시작 2.게임종료");
			menu = scn.nextInt();
			scn.nextLine();
			
			if (menu == 1) {
				if (cnt == 0) { //중복없이 값을 받아오는데 3s가 나올때까지 값 고정
					for (int i = 0; i < num.length; i++) {
						int n = (int) (Math.random() * 9) + 1;
						if (i == 0) {
							num[i] = n;
						} else if (i == 1) {
							while (num[i - 1] == n) {
								n = (int) (Math.random() * 9) + 1;
							}
							num[i] = n;
						} else if (i == 2) {
							while (num[i - 1] == n || num[i - 2] == n) {
								n = (int) (Math.random() * 9) + 1;
							}
							num[i] = n;
						}
						System.out.print(num[i]+" ");
					}
					cnt++;
				}

				System.out.println();
				System.out.println("숫자 3개를 입력하세요.(ex:1/2/3)");
				value = scn.nextLine();
				String[] stringVal = value.split("/");
				
				
				int[] intVal = new int[3];
				for (int i = 0; i < 3; i++) {
					intVal[i] = Integer.parseInt(stringVal[i]);
				}

				for (int i = 0; i < num.length; i++) {
					for (int j = 0; j < intVal.length; j++) {
						if (num[i] == intVal[j]) {
							if (i == j)
								strike++;
							else
								ball++;
						}
					}
				}

				System.out.println(strike + "s " + ball + "b");
				if (strike == 3 && ball == 0) {
					System.out.println("***STRIKE***");
					cnt=0;
				}
				strike = 0;
				ball = 0;
			} else if (menu == 2) {
				run = false;
			}

		}

	}
}
