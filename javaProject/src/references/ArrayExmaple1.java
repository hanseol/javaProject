package references;

public class ArrayExmaple1 {
	public static void main(String[] args) {
		
		int[] intArys = new int[5]; //int[5] intArys (x)
		
		for(int i=0; i<intArys.length;i++) {
			intArys[i] = (int)(Math.random()*10)+1;
			System.out.println(intArys[i]);
		}
		
		int maxValue = 0;
		for(int i=0;i<intArys.length;i++) {
			if(maxValue<intArys[i]) {
				maxValue = intArys[i];
			}
		}
		System.out.println("최대값 : " + maxValue);
	}
}
