package exercise;

import java.util.Arrays;
import java.util.Comparator;

import chapter11_2.Apple;

public class SortExample {

	public static void main(String[] args) {
		var list = Arrays.asList(   //Appleのリスト
				new Apple(320, "red"),
				new Apple(280, "green"),
				new Apple(350, "green"),
				new Apple(330, "red"),
				new Apple(250, "red")
				);
		
		list.sort(Comparator.comparing(Apple::weight).reversed());//weightで並び替え
		list.forEach(System.out::println);  //全要素を表示する
	}

}
