package operators;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		System.out.println(x++);
		System.out.println(++x); //12
		System.out.println(x);
		
		System.out.println("---------");
		z = ++x + y++; //z:23, x:13, y:11
		System.out.println("z: "+z + ", x:" + x +", y: " +y);
		
		System.out.println("---------");
		y--;
		--y;
		System.out.println("y="+ y);
		
		System.out.println("---------");
		z = x++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("---------");
		
	}
}
