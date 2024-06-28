package chapter17_1;

import java.time.LocalDate;
import java.time.LocalTime;

public class Sample7 {

	public static void main(String[] args) {
		var day = LocalDate.of(2024, 11, 20);
		var time = LocalTime.of(15, 8, 32);
		
		System.out.println(day.plusYears(3).plusMonths(2).plusDays(6));
		System.out.println(time.plusHours(3).plusMinutes(15));
	}

}
