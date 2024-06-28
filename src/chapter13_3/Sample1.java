package chapter13_3;

import java.util.LinkedList;
import java.util.stream.Collectors;

public class Sample1 {

	public static void main(String[] args) {
		var list = Book.getBookList();
		var myList = list.stream().collect(Collectors.toList());
		var mySet = list.stream().collect(Collectors.toSet());
		var myLinkedList = list.stream()
				.collect(Collectors.toCollection(LinkedList::new));//コンストラクタ参照
		
		myList.forEach(System.out::println);
		mySet.forEach(System.out::println);
		myLinkedList.forEach(System.out::println);
		
	}
	


}
