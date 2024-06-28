package exercise;

import java.util.stream.Collectors;

public class E1331_3 {

	public static void main(String[] args) {
		
		var list = Bread.getBreadList();
		String country = list.stream()
				.map(Bread::country)   //タイトルのストリームに変換
				.distinct()  //重複を取り除く
				.sorted()     //自然な順序に並び変える
				.collect(Collectors.joining(","));  //文字列連結
		System.out.println(country);
	}

}
