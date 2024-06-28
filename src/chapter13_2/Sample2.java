package chapter13_2;

import java.util.List;

public class Sample2 {

	public static void main(String[] args) {
		
		var list = List.of("apple", "peach", "grape","watermelon", "banana","cherry");
		list.stream()
			.skip(3)		//先頭から３つ捨てる
			.limit(2)		//最大２つの要素だけに制限する
			.forEach(System.out::println);
		
	}

	
}
