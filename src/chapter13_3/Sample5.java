package chapter13_3;

import java.util.stream.Collectors;

public class Sample5 {

	public static void main(String[] args) {
		var list = Book.getBookList();
		String titles = list.stream()
				.map(Book::title)   //タイトルのストリームに変換
				.collect(Collectors.joining(","));  //文字列連結
		System.out.println(titles);
	}

}
