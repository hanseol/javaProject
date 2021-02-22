package study;

public class Exercise02 {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = (++x) + (y--); //11+20=31, x=11, y=19
		System.out.println(z);
		//System.out.println(x);
		//System.out.println(y);
	}
}
