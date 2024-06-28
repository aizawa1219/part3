package chapter17_1;

import java.time.Duration;
import java.time.LocalTime;

public class Sample9 {

	public static void main(String[] args) {
		LocalTime start = LocalTime.of(10, 0, 0);
		LocalTime end = LocalTime.of(18, 33, 45);
		
		var d = Duration.between(start,end);
		System.out.println(d.toMinutes() + "分間");
		System.out.println(d.toSeconds() + "秒間");
	}

}
