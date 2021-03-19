package com.yedam.diary;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class DiaryListDAO implements DAO{

	String fileName = "diary.dat";
	String filePath;
	List<DiaryVO> list;
	
	public DiaryListDAO() { //생성자를 호출하는 시점에 경로 설정.
		filePath = System.getProperty("user.home") + "/" + fileName;
		readFile(); // 파일초기화.
	}
	
	public void readFile() {
		File file = new File(filePath);
		if(!file.exists()) {
			list=new ArrayList<DiaryVO>();
		}else {
			try {
				FileInputStream fis = new FileInputStream(filePath);
				BufferedInputStream bis = new BufferedInputStream(fis);
				ObjectInputStream ois = new ObjectInputStream(bis);
				
				list = (List<DiaryVO>) ois.readObject();
				System.out.println((list!=null ? list.size():0) +"건 read됨.");
				ois.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	
	public void writeFile() {
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			
			oos.writeObject(list);
			oos.close();
			System.out.println("저장됐따!!!!!!!!6_6");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public int insert(DiaryVO vo) {
		int cnt = list.size();
		int ii=0;
		for(int i=0; i<cnt;i++) {
			//중복날짜 입력불가
			if(list.get(i).getWdate().equals(vo.getWdate())) {
				return 0;
			}
			//순서 정렬 - ??
			if(list.get(i).getWdate().compareTo(vo.getWdate()) > 0) {
				ii=i; 
				break;
			}
		}
		
		list.add(ii,vo);
		writeFile();
		return 1;
	}

	@Override
	public void update(DiaryVO vo) {
		int cnt = list.size();
		
		for(int i=0;i<cnt;i++) {
			if(list.get(i).getWdate().equals(vo.getWdate())) {
				list.set(i, vo);
			}
		}
		writeFile();
	}

	@Override
	public int delete(String date) {
		int cnt = list.size();
		
		for(int i=0; i<cnt;i++) {
			if(list.get(i).getWdate().equals(date)) {
				list.remove(i);
				writeFile();
				return 1;
			}
		}
		return 0;
	}

	@Override
	public DiaryVO selectDate(String date) {
	
		for(DiaryVO l : list) {
			if(l.getWdate().equals(date)){
				return l;
			}
		}
		return null;
	}

	@Override
	public List<DiaryVO> selectContent(String content) {
		List<DiaryVO> contents = new ArrayList<DiaryVO>();
	
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getContents().contains(content)) {
				contents.add(list.get(i));
			}
		}
		
		return contents;
	}

	@Override
	public List<DiaryVO> selectAll() {
		return list;
	}

}
