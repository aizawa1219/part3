package chapter13_3;

import java.util.Comparator;
import java.util.Optional;

public class Sample3 {

	public static void main(String[] args) {
		
		var list = Book.getBookList();  //本のリストを取得
		Optional<Book> book = list.stream()
				.max( Comparator.comparing(Book::price)); //値段を比較
		System.out.println(book.orElseGet(Book::new));  //値を返す
	}

}
