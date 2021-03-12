package study;

import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Student[] stdInfo = new Student[5];

		boolean run = true;
		int menu;

		String id;
		String name;
		int score;

		while (run) {
			System.out.println("----------------------");
			System.out.println("1.등록 2.수정 3.삭제 4.조회");
			System.out.println("----------------------");

			menu = scn.nextInt();
			scn.nextLine();

			if (menu == 1) {
				System.out.print("학번>");
				id = scn.nextLine();
				System.out.print("이름>");
				name = scn.nextLine();
				System.out.print("점수>");
				score = scn.nextInt();
				scn.nextLine();

				Student s = new Student(id, name, score);

				for (int i = 0; i < stdInfo.length; i++) {
					if (stdInfo[i] == null) {
						stdInfo[i] = s;
						break;
					}
				}

			} else if (menu == 2) {
				System.out.print("수정-학번>");
				id = scn.nextLine();
				for(int i = 0; i<stdInfo.length;i++) {
					if(stdInfo[i]!=null && stdInfo[i].getId().equals(id)) {
						System.out.print("점수>");
						score = scn.nextInt();
						scn.nextLine();
						stdInfo[i].setScore(score);
						break;
					}
				}
			} else if (menu == 3) {
				System.out.print("삭제-학번>");
				id = scn.nextLine();
				for(int i = 0; i<stdInfo.length;i++) {
					if(stdInfo[i]!=null && stdInfo[i].getId().equals(id)) {
						stdInfo[i] = null;
					}
				}
			} else if (menu == 4) {
				for (int i = 0; i < stdInfo.length; i++) {
					if (stdInfo[i] != null) {
						System.out.println(stdInfo[i].toString());
					}
				}
			}else {
				run=false;
			}
		}
		System.out.println("학생정보 시스템 종료");
	}

}
