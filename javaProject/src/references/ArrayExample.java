package references;

public class ArrayExample {
	public static void main(String[] args) {
		// 1.배열 생성 후 값을 지정 해 주는 방법
		int[] scores1 = new int[5];
		scores1[0] = 90; //각 배열에 값을 지정.
		scores1[1] = 91;
		scores1[2] = 92;
		scores1[3] = 93;
		scores1[4] = 94;
		
		scores1[0] = 70; //배열에있는 값은 변경이 가능함
		System.out.println("변경후");
		for (int i = 0; i < 5; i++)
			System.out.println(scores1[i]); // 배열에 있는 값을 읽어오기
		
		
		// 2.배열 생성과 동시에 값을 지정 해 주는 방법
		int sum = 0; 
		double avg = 0;
		
		int[] scores2 = { 90, 91, 92, 93, 94 };
		for (int i = 0; i < 5; i++) {
			sum+=scores2[i];	
		}
		avg = sum / 5.0;
		System.out.println("합 : " + sum + ", 평균 : " + avg);

		//double 타입의 배열을 선언할 때
		double[] averages = {1,2,3,4,5}; //자동으로 실수형으로 저장된다.
		double d1 = averages[0]; //변수에 배열에 저장되어있는 값을 할당 할 수 있음.
		averages[3]=4.5;

		System.out.println(averages.length);//배열의 크기확인
		for(int i=0; i<averages.length; i++) { 
			System.out.println(averages[i]);
		}
		
		//배열은 동일한 타입의 값만 저장이 가능하다.
		//String 타입의 배열을 선언 할 때
		String[] strs = {"Hello","Good", "Nice", "20"}; //strs는 주소값을 가지고 있음.
		for(int i=0; i<strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
}
