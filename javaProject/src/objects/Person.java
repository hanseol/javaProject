package objects;

public class Person {
	String name;
	int age;
	double weight;
	double height;
	
	Person(){
		
	}
	
	Person(String name, int age, double height, double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	void introduce() {
		System.out.println("이름은 " + name + ", 나이는 " + age + "입니다.");
	}
}