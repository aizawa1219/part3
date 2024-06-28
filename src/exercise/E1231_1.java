package exercise;

import java.util.HashSet;

public class E1231_1 {

	public static void main(String[] args) {
		
		var set = new HashSet<User>();
		set.add(new User("ab123", "田中宏"));
		set.add(new User("ab224", "佐藤修"));
		set.add(new User("ab224", "佐藤おさむ"));   //重複
		set.add(new User("ac331", "木村正一"));
		
		set.forEach(System.out::println);
	}

}
