package generics;

public class Morning {
	public static void main(String[] args) {
		String gender;
		gender = checkGender("951229-1234567");
		System.out.println(gender);
		gender = checkGender("951129-2345678");
		System.out.println(gender);
		gender = checkGender("951012-3456789");
		System.out.println(gender);
		gender = checkGender("950804-4455566");
		System.out.println(gender);
		gender = checkGender("8904122456789");
		System.out.println(gender);
		gender = checkGender("0112233456678");
		System.out.println(gender);
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
		}
		return gender;
	}
}
