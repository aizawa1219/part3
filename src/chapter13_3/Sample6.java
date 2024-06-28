package chapter13_3;

import java.util.stream.Collectors;

public class Sample6 {

	public static void main(String[] args) {
		
		var list = Book.getBookList();
		var book_author = list.stream()
				.collect(Collectors.groupingBy(Book::author));
		
		book_author.forEach((k, v)->{
			System.out.println(k);    //kはキーの「著者名」
			v.forEach(System.out::println); // v は値の「Bookのlist」
		});
	}

}
