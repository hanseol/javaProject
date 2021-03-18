package com.yedam.diary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;

public class StdInputUtil {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static SimpleDateFormat df = new SimpleDateFormat("yyMMdd");

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
				result = br.readLine(); // 입력값.
				df.parse(result.trim()); // 사용자가 입력한 타입이 맞는지 확인.
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
		/*****/
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
}
