package streams;

public class Member {
	public static final int MALE = 0;
	public static final int FEMALE = 1;
	
	private String name;
	private int sex;
	private int age;
	
	public Member(String name, int sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}
	
	
	
	@Override
	public int hashCode() {
		return this.sex+this.age+this.name.hashCode();
	} //1차분류.

	@Override
	public boolean equals(Object obj) {
		Member m = (Member) obj;
		
		return this.name.equals(m.name) && this.sex == m.sex && this.age == m.age;
	}
	
	
}
