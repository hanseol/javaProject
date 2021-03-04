package objects2;

public class SingletonExample {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		Book b1 = new Book("a","aa","aaa",1000);
		Book b2 = new Book("a","aa","aaa",1000);
		
		System.out.println(s1==s2);
		System.out.println(b1==b2);
	}
}
