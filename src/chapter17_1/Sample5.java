package chapter17_1;

import java.time.LocalDate;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;

public class Sample5 {

	public static void main(String[] args) {
		var dateFormat = DateTimeFormatter.ofPattern("Gy年M月d日eeee");
		var jdate = JapaneseDate.from(LocalDate.of(2025,  1, 13));
		
		System.out.println(jdate.format(dateFormat));
	}

}
