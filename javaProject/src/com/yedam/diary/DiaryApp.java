
package com.yedam.diary;

public class DiaryApp {

	DAO dao; 

	public void start() { //DiaryApp.start()
		dao = new DiaryListDAO();
		int menuNum = 0;
		
		do {
			menuPrint();
			menuNum = menuChoose();
			process(menuNum);
			
		} while (menuNum != 0); //0 입력 : 프로그램 종료.
	}

	// 메뉴 출력
	public void menuPrint() {
		Menu[] arr = Menu.values();
		for (Menu menu : arr) {
			System.out.print(String.format("%d:%s", menu.ordinal(), menu.name())+" ");
		}
		System.out.println();
	}

	// 메뉴 선택
	public int menuChoose() {
		int menuSize = Menu.values().length-1;
		int menuNum;// = StdInputUtil.readInt();
		do {
			menuNum = StdInputUtil.readInt();
			if (menuNum <= menuSize)
				break;

			System.out.println(menuSize + "까지만 입력이 가능합니다.");
		} while (true);
		return menuNum;
	}
	
	//메뉴 실행
	public void process(int menuNum) {
		Menu menu = Menu.getMenu(menuNum);
		switch(menu) {
		case 종료: exit(); break;
		case 추가: insert(); break;
		case 수정: update(); break;
		case 삭제: delete(); break;
		case 전체조회: selectAll(); break;
		}
	}
	
	//종료
	public void exit() {
		System.out.println("종료선택>>");
		System.out.println("end of programm");
	}
	//입력
	public void insert() {
		System.out.println("입력선택>>");
		System.out.println("날짜:[yyMMdd]");
		String wdate = StdInputUtil.readDate();
		System.out.println("내용:");
		String contents =StdInputUtil.readMultiLine();
		
		DiaryVO vo = new DiaryVO();
		vo.setWdate(wdate);
		vo.setContents(contents);
		
		int cnt = dao.insert(vo);
		System.out.println(cnt+"건 입력완료.");
	}
	//수정
	public void update() {
		System.out.println("수정선택>>");
		System.out.println("날짜:[yyMMdd]");
		String wdate = StdInputUtil.readDate();
		System.out.println("내용:");
		DiaryVO vo = new DiaryVO();
		vo.setWdate(wdate);
		vo.setContents(StdInputUtil.readMultiLine());
		
		dao.update(vo);
		
	}
	//삭제
	public void delete() {
		System.out.println("삭제선택>>");
		System.out.println("날짜:[yyMMdd]");
		String wdate = StdInputUtil.readDate();
		int r = dao.delete(wdate);
		System.out.println(r+"건 삭제 @@@ bye.bye.");
	}
	//전체조회
	public void selectAll() {
		System.out.println("전체조회선택>>");
		for(DiaryVO vo : dao.selectAll()) {
			System.out.println(vo.getWdate());
			System.out.println(vo.getContents());
		}
	}
	
}//end of class
