package chapter13_3;

import java.util.stream.Collectors;

public class Sample7 {

	public static void main(String[] args) {
		
		var list = Book.getBookList();
		var book_author = list.stream()
				.collect(Collectors.groupingBy(
						Book::author,
						Collectors.mapping(Book::title, Collectors.toList())// 第一引数titleのストリームに変換。第二引数終端操作としてtitleの可変Listを生成
						));
		
		book_author.forEach((k,v)->{
			System.out.println(k);
			String titles = v.stream().collect(Collectors.joining(","));//vから要素のＣＳＶ文字列を生成する処理
			System.out.println(" " + titles);
		});
	}

}
