package chapter12_1;

import java.util.List;

import chapter11_2.Apple;

public class ForEachExample {

	public static void main(String[] args) {
		
		var list = getAppleList();
		list.forEach( t -> System.out.println(t));
//		list.forEach( System.out :: println); メソッド参照
	}

	//Appleのリストを返す
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
