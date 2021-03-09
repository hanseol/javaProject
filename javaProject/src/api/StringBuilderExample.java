package api;

import java.util.regex.Pattern;

public class StringBuilderExample {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString());
		
		sb.insert(4, "2");
		System.out.println(sb.toString());
		
		sb.setCharAt(4, '6');
		System.out.println(sb.toString());
		
		sb.replace(6,13,"Book"); //인덱스 6부터 13전까지
		System.out.println(sb.toString());
		
		sb.delete(4, 5); //인덱스 4부터 5전까지
		System.out.println(sb.toString());
		
		int length = sb.length();
		System.out.println("총문자수: " +length);
		
		String result = sb.toString();
		System.out.println(result);
		
		PatternExample();
	}
	
	public static void PatternExample() {
		String str = "\\d";
		String regExp = "(02|010)-\\d{3,4}-\\d{4}";
		String data = "010-123-4567";
		boolean result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "angel@naver.com";
		result = Pattern.matches(regExp, data);
		if(result) {
			System.out.println("정규식과 일치합니다.");
		}else {
			System.out.println("정규식과 일치하지 않습니다.");
		}
	}
}
