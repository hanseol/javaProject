package com.yedam.diary;

import java.util.List;

public class DiaryApp {

	DAO dao; 

	public void start() { 
		//dao = new DiaryListDAO();
		dao = new DiaryOracleDAO();
		int menuNum = 0;
		do {
			menuPrint();
			menuNum = menuChoose();
			process(menuNum);
		} while (menuNum != 0);
	}

	// 메뉴 출력
	public void menuPrint() {
		Menu[] arr = Menu.values();
		System.out.println("-------------------------------------------------------");
		for (Menu menu : arr) {
			System.out.print("|"+String.format("%d:%s", menu.ordinal(), menu.name())+" ");
		}
		System.out.println();
		System.out.println("-------------------------------------------------------");
	}

	// 메뉴 선택
	public int menuChoose() {
		int menuSize = Menu.values().length;
		int menuNum;
		do {
			menuNum = StdInputUtil.readInt();
			if (menuNum >=0 && menuNum < menuSize) {
				break;
			}else {
				System.out.println("0~"+ (menuSize-1) + "까지만 입력이 가능합니다.");
			}
		} while (true);
		return menuNum;
	}
	
	//메뉴 실행
	public void process(int menuNum) {
		Menu menu = Menu.getMenu(menuNum);
		switch(menu) {
		case 종료: exit(); 
			break;
		case 추가: insert(); 
			break;
		case 수정: update(); 
			break;
		case 삭제: delete(); 
			break;
		case 전체조회: selectAll();
			break;
		case 날짜검색: searchDate();
			break;
		case 내용검색: searchContent(); 
			break;
		}
	}
	
	//종료
	public void exit() {
		DBUtil.close(null, null, null);
		System.out.println("end of programm");
	}
	//입력
	public void insert() {
		dao = new DiaryOracleDAO();
		System.out.println("입력중>>");
		String contents =StdInputUtil.readMultiLine();
		DiaryVO vo = new DiaryVO();
		vo.setContents(contents);
		vo.setWdate(StdInputUtil.readInsertDate());
		
		int cnt = dao.insert(vo);
		System.out.println(cnt+"건 입력완료.");
	}
	//수정
	public void update() {
		dao = new DiaryOracleDAO();
		System.out.println("수정>>[yyyy/MM/dd hh:mm:ss] 형식에 맞추어 입력하세요.");
		String wdate = StdInputUtil.readDate();
		System.out.println("내용:");
		DiaryVO vo = new DiaryVO();
		vo.setWdate(wdate);
		vo.setContents(StdInputUtil.readMultiLine());
		
		dao.update(vo);
	}
	//삭제
	public void delete() {
		dao = new DiaryOracleDAO();
		System.out.println("삭제>>[yyyy/MM/dd hh:mm:ss] 형식에 맞추어 입력하세요.");
		String wdate = StdInputUtil.readDate();
		int r = dao.delete(wdate);
		System.out.println(r+"건 삭제 완료!");
	}
	
	//내용검색
	public void searchContent() {
		dao = new DiaryOracleDAO();
		System.out.println("검색>>찾고자 하는 단어를 입력하세요.");
		String word = StdInputUtil.readWord();
		List<DiaryVO> contents = dao.selectContent(word);
		
		for(DiaryVO vo : contents) {
			print(vo);
		}
	}
	
	//날짜검색
	public void searchDate() {
		dao = new DiaryOracleDAO();
		System.out.println("검색>>[yyyy/MM/dd hh:mm:ss] 형식에 맞추어 입력하세요.");
		String wdate = StdInputUtil.readDate();
		DiaryVO vo = dao.selectDate(wdate);
		
		if(vo.getWdate()!=null) {
			print(vo);
		}else {
			System.out.println("해당 날짜에 작성된 글이 없습니다.");
		}	
	}
	
	//전체조회
	public void selectAll() {
		System.out.println("전체 조회 중 ..");
		dao = new DiaryOracleDAO();
		for(DiaryVO vo : dao.selectAll()) {
			print(vo);
		}
	}
		
	public void print(DiaryVO vo) {
		System.out.println("<" + vo.getWdate() + ">");
		System.out.print("  " + vo.getContents());
	}
	
	
}//end of class
