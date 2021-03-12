package study;

import java.util.ArrayList;
import java.util.List;

public class Array {
	public static void sort(int[] iary) {
		
	}

	public static void main(String[] args) {
		int[] num = { 7, 5, 3, 2, 1, 4 };
		List<Integer> aList = new ArrayList<>();
		aList.add(3);
		aList.add(8);
		aList.add(4);
		aList.add(2);
		aList.add(1);
		aList.add(5);
		int temp = -1;
		
		for(int j=0; j<aList.size()-1;j++) {
			for(int i=0; i<aList.size()-1;i++) {
				if(aList.get(i)>aList.get(i+1)) {
					temp=aList.get(i);
					aList.set(i, aList.get(i+1));
					aList.set(i+1, temp);
				}
			}
		}
		for(Integer i : aList) {
			System.out.print(i + " ");
		}
		
		sort(num);
	}

}
