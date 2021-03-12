package api;

public class User {

	String userId;
	int score;
	
	public User() {
		
	}
//hashCode()와 equals()가 어떻게 정의되냐에 따라 논리적 동등함이 달라짐.
	@Override
	public int hashCode() {
//		return super.hashCode(); // Object class가 가지고 있는 hashCode() return
		return score;
	}

	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		User u = (User)obj;
		return this.userId.equals(u.userId);
	}
	
	
	
}
