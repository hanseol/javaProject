package study;

import java.util.Scanner;

public class Exercise07_4 {
	public static void main(String[] args) {
		boolean run = true;
		Scanner scn = new Scanner(System.in);
		int menu = 0;
		int sum = 0;

		while (run) {
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("선택>");

			menu=scn.nextInt();
			if(menu==1) {
				System.out.println("예금액>");
				sum+=scn.nextInt();
			}else if(menu==2) {
				System.out.println("출금액>");
				sum-=scn.nextInt();
			}else if(menu==3) {
				System.out.println("잔고>" + sum);
			}else {
				System.out.println("end of program");
			}
		} //end of while
	 scn.close();
	} //end of main
}
