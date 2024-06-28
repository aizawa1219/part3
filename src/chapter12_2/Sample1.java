package chapter12_2;

import java.util.HashSet;

public class Sample1 {

	public static void main(String[] args) {
		
		var set = new HashSet<Meibo>();
		set.add(new Meibo(100, "田中宏"));
		set.add(new Meibo(200, "木村正一"));
		set.add(new Meibo(100, "田中宏"));   //重複
		set.add(new Meibo(300, "佐藤修"));
		
		set.forEach(System.out::println);
	}

}
