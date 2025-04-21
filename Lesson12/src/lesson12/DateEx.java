package lesson12;

import java.util.Date;

public class DateEx {
	public static void main(String[] args) {
		//오늘날짜
		//1970.1. 1 >>70, 0, 1
		Date today = new Date(125, 3, 21);
		//수료날짜
		Date endDate = new Date(104, 11, 6);
		
//		System.out.println(endDate.getTime() - today.getTime());
		
		long duration = today.getTime() - endDate.getTime();
		System.out.println(duration/1000 / 60 / 60 / 24);
	}
}
