package references;

import java.util.Scanner;

public class Morning0226 {
	public static void main(String[] args) {
		morning0226();
	}
	
	public static void morning0226() {
		int[] engScores = new int[3];
		int[] mathScores = new int[3];

		double engEvg=0, mathEvg = 0;
		int engSum=0, mathSum = 0;
		int sum=0;
//수업--
//int[] engScores = new int[3];
//engScores = new int[] {89,88,87};
//int[] engScores = {89,88,87};
		
//		int[][] scores;
//		scores = new int[][] {{89,89},{88,88},{87,87}};
		
//		int[][] scores=new int[2][3];
//		scores[0] = new int[] {90,88,87};
//		scores[1] = new int[] {88,90,92};
//	
//		int[][] scores = {{90,88,87},{88,90,92}};
//		for(int i=0; i<scores.length;i++) {
//			for(int j=0; j<scores[i].length; j++) { 
//				sum = scores[i][j];
//			}
//		}
		
		System.out.println("영어점수 3개 입력");
		engSum=sumScores(engScores,engScores.length);
		System.out.println("수학점수 3개 입력");
		mathSum=sumScores(mathScores,mathScores.length);
		
		engEvg=evgScores(engSum, engScores.length);
		mathEvg=evgScores(mathSum, mathScores.length);
		
		System.out.println("영어평균 :" + engEvg + "수학평균 :" + mathEvg);
		
	}
	
	public static int sumScores(int[] scores, int studentNum) {
		
		Scanner scn = new Scanner(System.in);
		
		int sum=0;
				
		for(int i=0; i<scores.length; i++) {
			scores[i]=scn.nextInt();
			sum += scores[i];
		}	

		return sum;
	}
	
	public static double evgScores(int sum, int studentNum) {
		double evg = sum / (double)studentNum;
		
		return evg;
	}
}
