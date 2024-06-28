package chapter13_2;

import java.util.List;

public class Sample5 {

	public static void main(String[] args) {
		var list = List.of("apple", "peach","watermelon", "banana");
		int total = list.stream()
		.mapToInt(String::length)
		.sum();
		System.out.println("総文字数=" + total);
	}

}
