package studentManagementPkg.model;

public class StudentInfo {
	private int stuNo;
	private String name;
	private int age;
	private String phone;
	private int score;
	
	public StudentInfo() {
		
	}
	
	public StudentInfo(int stuNo, String name, int score) {
		this.stuNo = stuNo;
		this.name = name;
		this.score = score;
	}
	
	public StudentInfo(int stuNo, String phone) {
		this.stuNo = stuNo;
		this.phone = phone;
	}
	
	public StudentInfo(int stuNo, String name, int age, String phone) {
		this.stuNo = stuNo;
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	public int getStuNo() {
		return stuNo;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return stuNo + "/" + name + "/" + age + "/" + phone + "/"+ score ;
	}
	
	public String toStringScoreList() {
		return stuNo + "/" + name + "/" + score ;
	}
	
	
	
	
}
