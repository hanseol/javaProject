package objects2;

public class MemberService {
	
	public boolean login(String id, String password) {
		boolean check = false;
		if(id.equals("hong")&&password.equals("12345")) {
			check = true;
		}
		return check;
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
