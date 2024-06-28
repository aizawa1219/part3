package chapter13_2;

import java.util.List;

public class Sample1 {

	public static void main(String[] args) {
		
		var list = List.of("apple", "peach", "grape",  "apple", "banana","peach");
		list.stream()
			.distinct()		//重複を取り除く
			.sorted()		//自然な順序に並び変える
			.forEach(System.out::println);
	}

}
