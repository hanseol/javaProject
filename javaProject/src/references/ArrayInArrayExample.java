package references;

public class ArrayInArrayExample {
	public static void main(String[] args) {
		
		
		stringAry();
		//arrayCopy();
		//aryInary();
	}
	
	public static void stringAry() {
		String[] names= {"임성원","정준영","도왕락"};
		int[] scores = {88,89,90};
		int sum =0;
		//향상된 for문.
		for(String name : names) {
			System.out.println(name);
		}
		for(int score : scores) {
			sum+=score;
		} System.out.println(sum);
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i] + "점수 =>" + scores[i]);
		}
	}
	public static void arrayCopy() {
		int[] oldArray = { 1, 2, 3, 4, 5 };
		int[] newArray = new int[5];

		System.arraycopy(oldArray, 0, newArray, 0, 5);
		for (int i = 0; i < newArray.length; i++) {
			System.out.println(newArray[i]);
		}
	}
	

	public static void aryInary() {
		int[][] scores = {{90,88,87},{88,90,92}};
		double avg = 0.0;
		
		for(int i=0; i<scores.length; i++) {
			int sum = 0;
			for(int j=0; j<scores[i].length; j++) {
				sum += scores[i][j];
			}
			avg = (sum*10/scores[i].length)/10.0;
			System.out.println("평균"+avg);
		}
	}
}

