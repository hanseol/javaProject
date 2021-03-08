package inheritances;

import java.util.Scanner;

public class FriendList {
	static Friend[] friends = new Friend[10];
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String name, phone, department, major;
		
		
		while (true) {
			
			System.out.println("1.친구 2.학교친구 3.회사친구 4.전체목록 5.친구이름 검색 6.종료");
			int menu = scn.nextInt();
			//scn.nextLine();

			if (menu == 1) {
				System.out.print("이름 >");
				name=scn.next();
				System.out.print("전화번호 >");
				phone=scn.next();
				Friend friend=new Friend(name,phone);
				saveFriend(friend);
			} else if (menu == 2) {
				System.out.print("이름 > ");
				name=scn.next();
				System.out.print("전화번호 >");
				phone=scn.next();
				System.out.print("전공 > ");
				major=scn.next();
				saveFriend(new UnivFriend(name,phone,major));
			} else if (menu == 3) {
				System.out.print("이름 > ");
				name=scn.next();
				System.out.print("전화번호 >");
				phone=scn.next();
				System.out.print("부서 > ");
				department=scn.next();
				saveFriend(new ComFriend(name,phone,department));
			} else if (menu == 4) {
				for (Friend friend : friends) {
					if (friend != null) {
						System.out.println(friend.toString());
					}
				}
			} else if (menu == 5) {
				System.out.print("이름 검색 > ");
				name = scn.next();
				for(Friend friend : friends) {
					if(friend!=null && friend.getName().equals(name)) {
						System.out.println("친구정보: " + friend.toString());
					}
				}
			} else if (menu==6) {
				break;
			}
		}//end of while
		System.out.println("프로그램 종료");
		scn.close();
	} //end of main
	
	public static void saveFriend(Friend friend) { //매개변수의 다형성
		for(int i=0;i<friends.length;i++) {
			if(friends[i]==null) {
				friends[i]=friend; //인스턴스 생성
				break;
			}
		}
	}
}// end of class
