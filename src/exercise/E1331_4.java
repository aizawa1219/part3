package exercise;

import java.util.stream.Collectors;

public class E1331_4 {

	public static void main(String[] args) {
		
		var list = Bread.getBreadList();
		var bread_country = list.stream()
				.collect(Collectors.groupingBy(
						Bread::country,
						Collectors.mapping(Bread::name, Collectors.toList())// 第一引数titleのストリームに変換。第二引数終端操作としてtitleの可変Listを生成
						));
		
		bread_country.forEach((k,v)->{
			System.out.println(k);
			String name = v.stream().collect(Collectors.joining(","));//vから要素のＣＳＶ文字列を生成する処理
			System.out.println(" " + name);
		});
	}

}
