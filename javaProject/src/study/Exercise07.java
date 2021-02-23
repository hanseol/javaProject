package study;

public class Exercise07 {

	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		boolean z;
		
		System.out.println((x > 7) && (y <= 5)); //true
		System.out.println((x % 3 == 2) || (y % 2 != 1)); //false
		
		//z = (x++%2==0)|(y++%3==0); 연산후 x=11, y=6
		z = (x++%2==0)||(y++%3==0); //연산후 x=11 y=5 두개 중 앞이 true이면 바로 연산.
		if(z) {
			System.out.println("true:"+x+",y:"+y);
		}else {
			System.out.println("false:"+x+",y:"+y);
		}
		
	}
	
}
