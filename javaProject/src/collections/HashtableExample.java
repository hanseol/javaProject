package collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashtableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();

		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		map.put("winter", "456"); //키로 사용할 객체를 hashCode()와 equals() 메소드를 재정의해서 동등 객체가 될 조건을 정해야 함.

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("id, password 입력");
			System.out.print("id:");
			String id = scanner.nextLine();

			System.out.print("password:");
			String password = scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("login");
					break;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
			}else {
				System.out.println("입력하신 아이디가 존재하지 않습니다.");
			}
		}
		
		scanner.close();
	}
}
