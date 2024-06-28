package exercise;

import java.util.HashMap;

public class E124_1 {

	public static void main(String[] args) {
		
		var map = new HashMap<String, User>();
		
		User user1 = new User("ab123", "田中宏");
		User user2 = new User("ab224", "佐藤修");
		User user3 = new User("ab331", "木村正一");
		
		//キーはid、値はUserレコードとする
		map.put(user1.id(), user1);
		map.put(user2.id(), user2);
		map.put(user3.id(), user3);
		
		System.out.println(map.get("ab224"));
		System.out.println(user1);
		System.out.println(map);
	}

}
