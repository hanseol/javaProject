package study;

public class Exercise06 {

	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = 0;
		
		area = getRectArea(lengthTop,lengthBottom,height);
		System.out.println(area);
	}
	
	public static double getRectArea(int top, int bottom, int height) {
		double area = (top+bottom)*height/2.0;
		return area;
	}
}
