package controls;

public class SwitchExample {
	public static void main(String[] args) {

		// 0<= Math.random() < 1

//		for(int i=0; i<5; i++) {
//		int z = (int)(Math.random()*10)+1;
//		System.out.println(z); //0~1 임의 수
//		}

		String msg = "짝수/홀수";
		int z = (int) (Math.random() * 6) + 1;
		switch (z) {
		case 1:
		case 3:
		case 5:
			msg = "홀수";
			break;
		case 2:
		case 4:
		case 6:
			msg = "짝수";
			break;
		}
		System.out.println(z + "는 " + msg + "입니다.");
	}
}
