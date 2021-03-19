
package com.yedam.diary;

import java.util.Date;
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
		System.out.println("종료선택>>");
		System.out.println("end of programm");
	}
	//입력
	public void insert() {
		System.out.println("입력선택>>");
		System.out.println("내용:");
		String contents =StdInputUtil.readMultiLine();
		DiaryVO vo = new DiaryVO();
		vo.setContents(contents);
		vo.setWdate(StdInputUtil.readInsertDate());
		
		int cnt = dao.insert(vo);
		System.out.println(cnt+"건 입력완료.");
	}
	//수정
	public void update() {
		System.out.println("수정선택>>");
		System.out.println("날짜:[yyyy/MM/dd hh:mm:ss]");
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
		System.out.println("날짜:[yyyy/MM/dd hh:mm:ss]");
		String wdate = StdInputUtil.readDate();
		int r = dao.delete(wdate);
		System.out.println(r+"건 삭제 완료!");
	}
	
	//내용검색
	public void searchContent() {
		System.out.println("내용검색>>");
		//String word = StdInputUtil.readMultiLine();
		String word = StdInputUtil.readWord();
		List<DiaryVO> contents = dao.selectContent(word);
		
		for(int i=0;i<contents.size();i++) {
			print(contents.get(i));
		}
	}
	
	//날짜검색
	public void searchDate() {
		System.out.println("날짜검색>>");
		System.out.println("날짜:[yyyy/MM/dd hh:mm:ss]");
		String wdate = StdInputUtil.readDate();
		DiaryVO vo = dao.selectDate(wdate);
		
		if(vo!=null) {
			print(vo);
		}else {
			System.out.println("해당 날짜에 작성된 글이 없습니다.");
		}	
	}
	
	//전체조회
	public void selectAll() {
		for(DiaryVO vo : dao.selectAll()) {
			print(vo);
		}
	}
		
	public void print(DiaryVO vo) {
		System.out.println("-----------------------------");
		System.out.println("날짜는 : " + vo.getWdate());
		System.out.println("내용은 : " + vo.getContents());
	}
	
	
}//end of class
