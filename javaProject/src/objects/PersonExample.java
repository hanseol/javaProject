package objects;

public class PersonExample {
	public static void main(String[] args) {
		Person[] persons = new Person[5];
		persons[0] = new Person ("홍길동",20,174.5,70.5);
		persons[1] = new Person ("박길동",24,164.5,65.5);
		persons[2] = new Person ("최길동",22,182.5,82.5);
		persons[3] = new Person ("윤길동",21,178.5,62.5);
		persons[4] = new Person ("이길동",19,166.5,80.5);
		
		new Person();
		
		for(Person person : persons) {
			if(person.age>20 && person.height>180)
				person.introduce();
		}
	}
}
