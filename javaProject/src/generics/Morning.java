package generics;

public class Morning {
	public static void main(String[] args) {
		String gender;
		gender = checkGender("951229-1234567"); //남자
		System.out.println(gender);
		gender = checkGender("951129-2345678"); //여자
		System.out.println(gender);
		gender = checkGender("951012-3456789"); //남자
		System.out.println(gender);
		gender = checkGender("950804-4455566"); //여자
		System.out.println(gender);
		gender = checkGender("8904122456789"); //여자
		System.out.println(gender);
		gender = checkGender("0112233456678"); //남자
		
		
		//두 수의 합을 구하고 합의 결과를 3자리 단위로, 4,530,890 보여주는 메소드.
		sum("44000","23400");
		
	}
	
	public static void sum(String a, String b) {
		int sum = Integer.parseInt(a) + Integer.parseInt(b);
		String s = String.valueOf(sum);
		
		//s 길이에 따라.
		//뒤에서부터 3자리씩 인식 index : s.length-1
		//, 넣어주기. index:0
		
		String token[] = new String[s.length()];	

		System.out.print(s.substring(0,2)+",");
		System.out.println(s.substring(2));
		
		
	}
	
	
	public static String checkGender(String j) {
		
		//1. 문자열 길이 비교 13자리일때(숫자만), 14자리일때(기호포함)
		//2. charAt(6), charAt(7)
		char num ;
		String gender="";
		
		if(j.length()==14) {
			num = j.charAt(7);
			switch(num) {
			case '1':
			case '3':
				gender ="남자";
				break;
			case '2':
			case '4':
				gender ="여자";
				break;
			}
		}else if(j.length()==13) {
			num = j.charAt(6);
			switch(num) {
			case '1': 
			case '3':
				gender ="남자";
				break;
			case '2':
			case '4':
				gender ="여자";
				break;
			}
		}else {
			System.out.println("주민등록번호 자리수가 맞지 않습니다.");
		}
		return gender;
	}
}
