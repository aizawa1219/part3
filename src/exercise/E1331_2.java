package exercise;

import java.util.OptionalDouble;

public class E1331_2 {

	public static void main(String[] args) {
		var list = Bread.getBreadList();
		
		int total = list.stream()
				.mapToInt(Bread::price)  //金額（int型）のストリームに変換
				.sum();
		
		OptionalDouble ave = list.stream()
				.mapToInt(Bread::price)
				.average();//平均値
		
		
		System.out.println("合計金額 = " + total);
		System.out.printf("平均額 = %.1f",ave.orElse(0)); //orElse値を返す。値が空の場合0が返る。

	}

}
