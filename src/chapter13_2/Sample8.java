package chapter13_2;

import java.util.List;

public class Sample8 {

	public static void main(String[] args) {
		var list = List.of("apple", "peach", "watermelon");
		list.stream()
			.peek(e -> System.out.print(e + " ")) //要素を表示してみる
			.map(String::toUpperCase)			//要素を大文字に変換
			.forEach(e -> System.out.println(e)); //結果を表示する
	}

}
