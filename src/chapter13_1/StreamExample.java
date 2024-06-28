package chapter13_1;

import java.util.List;

public class StreamExample {

	public static void main(String[] args) {
		
		var list = List.of("banana", "orange", "peach", "apple", "pineapple");
		
		list.stream()					//ストリームを生成
		.filter(e -> e.length()<6)		//フィルタリング（長さが６未満に限定）
		.map(e -> e.toUpperCase())		//大文字に変換する
		.forEach(System.out::println);	//コンソールに表示する
	}

}
