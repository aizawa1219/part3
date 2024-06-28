package exercise;

import java.time.LocalDate;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;

public class E1721_1 {

	public static void main(String[] args) {
		var dateFormat = DateTimeFormatter.ofPattern("Gy年M月d日eeee");
		var jdate = JapaneseDate.from(LocalDate.now());
		
		System.out.println(jdate.format(dateFormat));
	}

}
