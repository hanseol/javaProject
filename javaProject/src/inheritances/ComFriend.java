package inheritances;

public class ComFriend extends Friend {
	String department;

	public ComFriend(String name, String phone, String department) {
		super(name, phone); // 부모 생성자 호출
		this.department = department;
	}

	@Override
	public String toString() {
		return "ComFriend [department=" + department + ", name=" + super.getName() + ", phone=" + super.getPhone()
				+ "]";
	}

}
