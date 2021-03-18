package com.yedam.diary;

import java.util.List;

//DiaryListDAO 클래스에서 기능 정의.
public interface DAO {
	public int insert(DiaryVO vo);
	public void update(DiaryVO vo);
	public int delete(String date);
	public DiaryVO selectDate(String date);
	public List<DiaryVO> selectContent(String content);
	public List<DiaryVO> selectAll();
}
