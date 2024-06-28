package chapter12_2;

import java.util.HashMap;

public class Sample4 {

	public static void main(String[] args) {
		
		var map = new HashMap<Integer, String>();
		map.put(205, "田中宏");
		map.put(100, "木村正一");
		map.put(300, "佐藤修");
		
		System.out.println(map.get(100));
		System.out.println(map.get(150));
		
		map.forEach((k,v) -> System.out.println(k + " " + v));
		
	}

}
