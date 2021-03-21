package com.yedam.diary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class StdInputUtil {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	
	static int readInt() {
		int result = 0;
		String temp;

		do {
			try {
				temp = br.readLine();
				result = Integer.parseInt(temp);
				break;
			} catch (Exception e) {
				System.out.println("숫자 형식이 아닙니다.");
			}
		} while (true);

		return result;
	}

	// 날짜입력
	public static String readDate() {
		String result = "";
		do {
			try {
				result = br.readLine(); 
				df.parse(result.trim()); 
				break;
			} catch (Exception e) {
				System.out.println("날짜 형식이 맞지 않습니다.");
			}
		} while (true);

		return result;
	}
	
	public static String readInsertDate() {
		String result = "";
		do {
			try {
				result = df.format(new java.util.Date()); //글 등록 시, 시스템 날짜 사용.
				df.parse(result.trim());
				break;
			} catch (Exception e) {
				System.out.println("날짜 형식이 맞지 않습니다.");
			}
		} while (true);

		return result;
	}

	// 내용 (여러줄 입력)
	public static String readMultiLine() {
		StringBuffer result = new StringBuffer();
		try {
			while (true) {
				String temp = br.readLine();
				if(temp.equals("end")) {
					break;
				}
				result.append(temp + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result.toString();
	}
	
	//내용 (특정 단어 검색)
	public static String readWord() {
		
		String word="";
		try {
			word = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return word;

	}
}
