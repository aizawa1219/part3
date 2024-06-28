package chapter17_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Sample3 {

	public static void main(String[] args) {
		System.out.println(LocalDate.parse("2025-01-13"));
		System.out.println(LocalTime.parse("15:08:32"));
		System.out.println(LocalDateTime.parse("2025-01-13T15:08:32"));
	}

}
