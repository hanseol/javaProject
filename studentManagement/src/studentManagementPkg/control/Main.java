package studentManagementPkg.control;

import java.util.Scanner;

import studentManagementPkg.model.StudentInfo;
import studentManagementPkg.model.impl.ServiceImplement;

public class Main {
	public static void main(String[] args) {
		int stdId;
		int loginState = 0;
		boolean run = true;
		ServiceImplement service = new ServiceImplement();
		Scanner scn = new Scanner(System.in);

		String user = "admin";
		String passwd = "super";

		String insertUser="";
		String insertPasswd="";

		while (true) {
			if(loginState==1) {
				break;
			}
			System.out.print("관리자 > ");
			insertUser = scn.nextLine();

			if (user.equals(insertUser)) {
				System.out.print("비밀번호 > ");
				insertPasswd = scn.nextLine();
				if (passwd.equals(insertPasswd)) {
					loginState=1;
					System.out.println("로그인");
					
					while (run) {
						System.out.println("-----------------------------------------------------------");
						System.out.println("1.학생등록 2.학생정보수정 3.성적입력 4.성적조회 5.성적수정 6.전체리스트 9.종료");
						System.out.println("-----------------------------------------------------------");
						
						int menu = scn.nextInt();
						scn.nextLine();

						if (menu == 1) {// 학생등록
							System.out.print("학번 입력>");
							stdId = scn.nextInt();
							scn.nextLine();
							System.out.print("이름 입력>");
							String name = scn.nextLine();
							System.out.print("나이 입력>");
							int age = scn.nextInt();
							scn.nextLine();
							System.out.print("연락처 입력>");
							String phone = scn.nextLine();

							StudentInfo std = new StudentInfo(stdId, name, age, phone);
							service.enrollStu(std);

						} else if (menu == 2) {// 학생정보수정
							System.out.print("학번 입력>");
							stdId = scn.nextInt();
							scn.nextLine();
							System.out.print("연락처 변경>");
							String phone = scn.nextLine();

							StudentInfo std = new StudentInfo(stdId, phone);
							service.updateStuInfo(std);

						} else if (menu == 3) { // 성적입력
							int scores;
							StudentInfo[] stdList = service.getStudentList();
							for (StudentInfo std : stdList) {
								if (std != null && std.getScore() == 0) {
									System.out.print(std.getStuNo() + "/" + std.getName() + ">");
									scores = scn.nextInt();
									scn.nextLine();
									StudentInfo s = new StudentInfo(std.getStuNo(), null, scores);
									service.updateScore(s);
								}else {
									break;
								}
							}
							System.out.println("성적이 모두 입력되었습니다.");
						} else if (menu == 4) { // 성적조회
							System.out.print("학번>");
							stdId = scn.nextInt();
							scn.nextLine();

							StudentInfo list = service.listScore(stdId);
							if (list != null) {
								System.out.println(list.toStringScoreList());
							}
						} else if (menu == 5) { // 성적수정
							System.out.print("학번>");
							stdId = scn.nextInt();
							scn.nextLine();
							int score = 0;

							StudentInfo[] std = service.getStudentList();

							for (int i = 0; i < std.length; i++) {
								if (std[i].getStuNo() == stdId) {
									System.out.print(" 현재점수:" + std[i].getScore()); // 현재 점수 출력
									System.out.print(" 변경>");
									score = scn.nextInt();
									scn.nextLine();

									StudentInfo student = new StudentInfo(stdId, null, score);
									service.updateScore(student);
									break;
								}
							}
						} else if (menu == 6) {// 전체리스트
							StudentInfo[] list = service.getStudentList();
							for (StudentInfo std : list) {
								if (std != null) {
									System.out.println(std.toString());
								}
							}
						} else if (menu == 9) {
							run=false;
						}
					}//end of while	for service
				} else {
					System.out.println("비밀번호를 확인하세요.");
				}
			} else {
				System.out.println("관리자 정보를 확인하세요.");
			}
		}//end of while for login
		System.out.println("프로그램을 종료합니다 : )");
		scn.close();
	}
}
