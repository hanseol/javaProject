package com.yedam.diary;

import java.io.Serializable;
import java.util.Date;

public class DiaryVO implements Serializable{
	private static final long serialVersionUID = 1L;
	private String wdate;
	private String contents;
	
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	
}
