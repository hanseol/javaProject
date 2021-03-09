package api;

import java.io.UnsupportedEncodingException;
import java.util.StringTokenizer;

public class StringExample {
	public static void main(String[] args) {
//		ByteToStringExample();
//		StringCharAtExample();
//		StringEqualsExample();
//		StringGetBytesExample();
//		StringIndexOfExample();
//		StringLengthExample();
//		StringReplaceExample();
//		StringSubstringExample();
		StringTolowerUpperCaseExample();
		StringTrimExample();
		StringValueOfExample();
		StringSplitExample();
		StringTokenizerExample();
	}

	public static void ByteToStringExample() { // 바이트 배열을 문자열로 변환
		byte[] bytes = { 72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		String str1 = new String(bytes);
		System.out.println(str1);

		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
	}

	public static void StringCharAtExample() { // 문자추출(charAt())
		String ssn = "010624-1230123"; // index 0~문자열길이-1
		char sex = ssn.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
	}

	public static void StringEqualsExample() {// 문자열비교(equals())
		String strVar1 = new String("신민철");
		String strVar2 = "신민철";

		if (strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
		}

		if (strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
	}

	public static void StringGetBytesExample() {
		String str = "안녕하세요";

		byte[] bytes1 = str.getBytes();
		System.out.println("bytes1.length: " + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("bytes1->String: " + str1);

		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("bytes2.length: " + bytes2.length);
			String str2 = new String(bytes2, "EUC-KR");
			System.out.println("bytes2->String: " + str2);

			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("bytes3.length: " + bytes3.length);
			String str3 = new String(bytes3, "UTF-8");
			System.out.println("bytes3->String: " + str3);

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

	public static void StringIndexOfExample() {
		String subject = "자바 프로그래밍";

		int location = subject.indexOf("프로그래밍");
		System.out.println(location);

		if (subject.indexOf("자바") != -1) {
			System.out.println("자바와 관련된 책이군요.");
		} else {
			System.out.println("자바와 관련 없는 책이군요");
		}
	}

	public static void StringLengthExample() {
		String ssn = "9512290000000";
		int length = ssn.length();
		if (length == 13) {
			System.out.println("주민번호 자리수가 맞습니다.");
		} else {
			System.out.println("주민번호 자리수가 틀립니다.");
		}
	}
	
	public static void StringReplaceExample() {
		String oldStr = "자바는 객체지향언어 입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
	}
	
	public static void StringSubstringExample() {
		String ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
	}
	
	public static void StringTolowerUpperCaseExample() {
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		
		System.out.println(lowerStr1.equals(lowerStr2));
		System.out.println(str1.equalsIgnoreCase(str2));
	}
	
	public static void StringTrimExample() {
		String tel1 = "  02";
		String tel2 = "123  ";
		String tel3 = "  1234  ";
		
		String tel = tel1.trim() + tel2.trim() +tel3.trim();
		System.out.println(tel);
	}
	public static void StringValueOfExample(){
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(10.5);
		String str3 = String.valueOf(true);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
	public static void StringSplitExample() {
		String text = "홍길동&이수홍,박연수,김자바-최명호";
		
		String[] names = text.split("&|,|-");
		
		for(String name : names) {
			System.out.println(name);
		}
	}
	
	public static void StringTokenizerExample() {
		String text = "홍길동/이수홍/박연수";
		
		//how1:전체 토큰 수를 얻어 for문으로 루핑
		StringTokenizer st = new StringTokenizer(text,"/");
		int countTokens = st.countTokens();
		for(int i=0; i<countTokens; i++) {
			String token = st.nextToken();
			System.out.println(token);
		}
		
		System.out.println();
		
		//how2 : 남아있는 토큰을 확인하고 while문으로 루핑
		st = new StringTokenizer(text, "/");
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}
	
}
