package chapter13_3;

import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Sample4 {

	public static void main(String[] args) {
		var list = Book.getBookList();
		
		int total = list.stream()
				.mapToInt(Book::price)  //金額（int型）のストリームに変換
				.sum();
		
		OptionalDouble ave = list.stream()
				.mapToInt(Book::price)
				.average();//平均値
		
		OptionalInt max = list.stream()
				.mapToInt(Book::price)
				.max();
		
		System.out.println("合計金額 = " + total);
		System.out.println("平均額 = " + ave.orElse(0)); //orElse値を返す。値が空の場合0が返る。
		System.out.println("最高額 = " + max.orElse(0));
	}

}
