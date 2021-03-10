package objects2.annotations;

public class Service {
	@PrintAnnotation
	String name;
	int age;
	
	Service(){
		
	}
	
	Service(String name){
		this.name=name;
	}
	Service(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	@PrintAnnotation(value="*")
	public void method1() {
		
	}
	
	@PrintAnnotation(value="*",number=20)
	public void method2() {
		
	}
	
	@PrintAnnotation(value="/",number=30)
	public void method3() {
		
	}
	
	
	
}
