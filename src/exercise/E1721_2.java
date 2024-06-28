package exercise;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class E1721_2 {

	public static void main(String[] args) {
		var timeFormat = DateTimeFormatter.ofPattern("ah時m分s秒");
		var time = LocalTime.now();
		
		System.out.println(time.format(timeFormat));
	}

}
