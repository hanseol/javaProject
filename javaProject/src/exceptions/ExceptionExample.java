package exceptions;

import abscractClasses.Animal;
import abscractClasses.Bird;
import abscractClasses.Cat;

public class ExceptionExample {
	public static void main(String[] args) {
//		NullPointerExceptionExample();
//		ArrayIndexOutOfBoundsException(args);
//		NumberFormatExceptionExample();
		ClassCastExceptionExample();
	}

	public static void NullPointerExceptionExample() {
		String data = null;
		System.out.println(data.toString());
	}

	public static void ArrayIndexOutOfBoundsException(String[] args) {
		if (args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			System.out.println("args[0]: " + data1);
			System.out.println("args[1]: " + data2);
		}else {
			System.out.println("[실행 방법]");
			System.out.print("java ArrayindexOutOfBoundsExceptionExample ");
			System.out.println("값1 값2");
		}
	}

	public static void NumberFormatExceptionExample() {
		String data1 = "100";
		String data2 = "a100";
		int value1= Integer.parseInt(data1);
		int value2= Integer.parseInt(data2);
	}
	
	public static void ClassCastExceptionExample() {
		Bird bird = new Bird("조류");
		bird.sound();
		changeBird(bird);
		Cat cat = new Cat("포유류");
		cat.sound();
		changeBird(cat);
		
	}
	public static void changeBird(Animal animal) {
		if(animal instanceof Bird) {
			Bird bird = (Bird) animal;
			bird.sound();
		}else {
			System.out.println("새는 고양이가 아닙니다.");
		}
	}
	
}
