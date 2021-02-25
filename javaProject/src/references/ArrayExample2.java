package references;

import java.util.Scanner;

public class ArrayExample2 {
	public static void main(String[] args) {
		int intArys[] = new int[10];
		int sum = 0;
		double avg = 0;
		int cnt = 0;
		
		for(int i=0; i<intArys.length; i++) {
			intArys[i] = (int)(Math.random()*100)+1;
		}
		
		for(int i=0; i<intArys.length;i++) {
			if(intArys[i]%2==0) {
				sum+=intArys[i];
				cnt++;
				System.out.println(intArys[i]);
			}
		}
		
		avg = sum / (double)cnt;
		System.out.println("짝수 평균 : " + (avg));
		
		//오름차순
		int empty = 0;
		for(int i=0;i<intArys.length;i++) {
			for(int j=0; j<intArys.length-1;j++) {
				if(intArys[i]<intArys[j]) {
					empty = intArys[i];
					intArys[i] = intArys[j];
					intArys[j] = empty;
				}
			}
		}
		
		System.out.print("오름차순으로 정렬 ");
		for(int i=0; i<intArys.length;i++) {
			System.out.print("|"+ intArys[i]);
		}
		
		System.out.println();
		Scanner scn = new Scanner(System.in);
		while(true) {
			System.out.println("배열의 위치 입력: ");
			int loc = scn.nextInt();
			if(loc < 0 || loc > intArys.length-1) {
				System.out.println("범위를 벗어남.");
				break;
			}
			System.out.println(loc + " 위치의 배열값은 :" + intArys[loc]);
		}
		scn.close();
		
	}
}
