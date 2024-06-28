package chapter13_1;

import java.util.List;

public class ToListExample {

	public static void main(String[] args) {
		
		var list = List.of("banana", "orange", "peach", "apple", "pineapple");
		
		var result = list.stream()		//リストを受け取る
		.filter(e -> e.length()<6)		//フィルタリング（長さが６未満に限定）
		.map(e -> e.toUpperCase())		//大文字に変換する
		.toList();
//		.collect(Collectors.toList());	結果をリストにする
		
		result.forEach(System.out::println);  //確認のための表示
		
//		result.add("soccer");
//		System.out.println(result);
	}

}
