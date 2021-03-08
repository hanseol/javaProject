package abscractClasses;

import java.util.Calendar;

public class CalendarExe {
	public static void main(String[] args) {
		
		showCal(2021,7); // 5월달 달력을 보여주는 메소드.
		
	} //end of main
	
	public static void showCal(int year, int month) {
		int m = month-1;
		int cnt = 0;
		Calendar cal = Calendar.getInstance(); // 오늘 날짜 기준으로 달력정보 생성
		//System.out.println(cal.get(Calendar.YEAR));
		//System.out.println(cal.get(Calendar.WEEK_OF_MONTH)); //현재 월의 몇째주
		//System.out.println(cal.get(Calendar.MONTH)); // 1월:0~12월:11
		//System.out.println(cal.get(Calendar.DAY_OF_MONTH)); 현재 몇일
		//System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //현재 요일 (일:1)

		
		System.out.println(" --------------------------");

		cal.set(year, m, 1); // 날짜 지정
		System.out.println( " << "+(cal.get(Calendar.MONTH)+1) + "월 달력 >>");
		int lastDate = cal.getActualMaximum(Calendar.DATE); // 달의 마지막 날.
		int firstDay = cal.get(Calendar.DAY_OF_WEEK); //현재 요일.

			System.out.printf("%4s", "SUN");
			System.out.printf("%4s", "MON");
			System.out.printf("%4s", "TUE");
			System.out.printf("%4s", "WED");
			System.out.printf("%4s", "THR");
			System.out.printf("%4s", "FRI");
			System.out.printf("%4s", "SAT");
			System.out.println();
		
		for (int i = 1; i < firstDay; i++) {
			System.out.printf("%4s", " ");
		}
		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%4d", i);
			
			if(((firstDay+i)-1)%7==0) {
				System.out.println();
			}
			
		}

	}
}
