package study;

public class Exercise06_4 {

	public static void main(String[] args) {
		int lineNumber=1;
		
		for(int i=lineNumber; i<=5; i++) {
			switch (lineNumber) {
			case 1 :
				System.out.println("*"); 
				lineNumber++;
			case 2 :
				System.out.println("**"); 
				lineNumber++;
			case 3 :
				System.out.println("***"); 
				lineNumber++;
			case 4 :
				System.out.println("****"); 
				lineNumber++;
			case 5 :
				System.out.println("*****"); 
				lineNumber++;
			}
		}

	}

}
