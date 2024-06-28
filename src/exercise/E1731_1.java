package exercise;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class E1731_1 {

	public static void main(String[] args) {
		LocalDate born = LocalDate.of(1979, 1, 3);
		LocalDate start = LocalDate.of(2002, 4, 1);
		LocalDate now = LocalDate.now();
		
		System.out.println(ChronoUnit.YEARS.between(born, now) + "才");
		
		var p = Period.between(start, now);
		System.out.printf("勤続%d年%dヶ月", 
				p.getYears(), p.getMonths());
	}

}
