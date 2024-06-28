package chapter17_1;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Sample8 {

	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2023, 1, 13);
		LocalDate end = LocalDate.of(2025, 1, 1);
		
		System.out.println(ChronoUnit.MONTHS.between(start, end) + "か月");
		System.out.println(ChronoUnit.DAYS.between(start, end) + "日間");
		
		var p = Period.between(start, end);
		System.out.printf("%d年%dヶ月%d日", 
				p.getYears(), p.getMonths(), p.getDays());
	}

}
