package chapter17_1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Sample4 {

	public static void main(String[] args) {
		var dateFormat = DateTimeFormatter.ofPattern("y年M月d日eeee");
		var timeFormat = DateTimeFormatter.ofPattern("ah時m分s秒");
		
		System.out.println(LocalDate.of(2025, 1, 13).format(dateFormat));
		System.out.println(LocalTime.of(15, 8, 32).format(timeFormat));
	}

}
