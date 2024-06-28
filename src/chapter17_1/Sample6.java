package chapter17_1;

import java.time.LocalDate;

public class Sample6 {

	public static void main(String[] args) {
		
		var day1 = LocalDate.of(2024, 11, 20);
		var day2 = LocalDate.of(2025, 1, 13);
		
		System.out.println(day1.isAfter(day2));
		System.out.println(day1.isBefore(day2));
		System.out.println(day1.equals(day2));
		System.out.println(day1.isLeapYear());
	}

}
