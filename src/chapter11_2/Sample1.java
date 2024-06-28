package chapter11_2;

import java.util.List;

public class Sample1 {

	public static void main(String[] args) {
		testApple( a -> a.weight()>=300);  //指定した条件でリストアップする
	}
	public static void testApple(Predicate p) {
		var list = getAppleList();  // Appleのリストを取得する
		for(Apple apple : list) {
			if(p.test(apple)) {
				System.out.println(apple);
			}
		}
	}
	// Appleのリストを返すメソッド
	public static List<Apple> getAppleList(){
		var list = List.of(
			new Apple(320, "red"),
			new Apple(280, "green"),
			new Apple(350, "green"),
			new Apple(330, "red"),
			new Apple(250, "red")
	);
	return list;
	}

}
