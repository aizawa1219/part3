package exercise;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class E1711_2 {

	public static void main(String[] args) {
		System.out.println(LocalDate.parse("2025-03-01"));
		System.out.println(LocalTime.parse("15:05:45"));
		System.out.println(LocalDateTime.parse("2025-03-01T23:05:45"));
	}

}
