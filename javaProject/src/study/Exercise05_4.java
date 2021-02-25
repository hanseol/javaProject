package study;

import java.util.Scanner;

public class Exercise05_4 {
	public static void main(String[] args) {

		int x = 0, y = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("두 수를 입력하세요!");
		x = scn.nextInt();
		y = scn.nextInt();
		int result = getSumValue(x, y);
	
		System.out.println(x + "~" + y + " 까지의 합 = " + result);
		//Exercise05();

	}

	public static int getSumValue(int n1, int n2) {
		int sum = 0;
		
		// 1 
		int startNo = (n1>n2) ? n2 : n1;
		int Endno = (n1>n2) ? n1 : n2;
		
		for (int i = startNo; i <= Endno; i++) {
				sum += i;
		}
		
		//2
		if(n1>n2) {
			for(; n1>=n2; n2++) {
				sum += n2;
			}
		}else {
			for (; n2>=n1 ; n1++){
				sum+= n1;
			}
		}
		
		//3
		if(n1>n2) {
			for(int i=n1; i>=n2 ; i--) {
				sum += i;
			}
		}else {
			for (int i=n1; i<=n2 ; i++){
				sum+=i;
			}
		}
		return sum;
	}

	public static void Exercise05() {
		int x, y;

		for (x = 1; x <= 10; x++) {
			for (y = 1; y <= 10; y++) {
				if (4 * x + 5 * y == 60) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
	} // end of Exercise05()
}
