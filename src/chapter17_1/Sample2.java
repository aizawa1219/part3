package chapter17_1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Sample2 {

	public static void main(String[] args) {
		System.out.println(LocalDate.of(2025, 1, 13));
		System.out.println(LocalTime.of(15, 8, 32));
		System.out.println(LocalDateTime.of(2025, 1, 13, 15, 8, 32));
	}

}
