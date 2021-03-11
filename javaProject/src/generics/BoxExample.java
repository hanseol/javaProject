package generics;

public class BoxExample {
	public static void main(String[] args) {
		String str = new String("apple");
		Apple apple = new Apple();
		Orange orange = new Orange();
		
		Box<String> box = new Box<String>();
		box.setBox(str);
		
		Box<Apple> appleBox = new Box<Apple>();
		appleBox.setBox(apple);
		
		Box<Orange> orangeBox = new Box<Orange>();
		orangeBox.setBox(orange);
		
//		//casting이 필요 x
//		String newStr = box.getBox();
//		Apple newApple = appleBox.getBox();
//		Orange newOrange = orangeBox.getBox();
		
		Apple one = new Apple(1000,"부사");
		Apple two = new Apple(2000,"홍옥");
		System.out.println(one);
		System.out.println(two);
		
		if(one.equals(two)) {
			System.out.println("동일객체");
		}else {
			System.out.println("다른객체");
		}
	}
}
