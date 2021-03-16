package collections;

public class Student {
	private int sno;
	private String name;
	public Student(int sno, String name) {
		super(); //부모클래스의 생성자를 먼저 만드는 의미.
		this.sno = sno;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		//System.out.println(this.name.hashCode());
		return this.sno + this.name.hashCode();
		
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			//비교대상이 student클래스가 맞을 경우
			Student s = (Student) obj; //Object클래스에는 sno필드가 없음. 형변환 필요.
			return this.sno == s.sno && this.name.equals(s.name);
		}else
			return false;
	}

	
	
}
