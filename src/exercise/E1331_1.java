package exercise;

import java.util.Comparator;
import java.util.Optional;

public class E1331_1 {

	public static void main(String[] args) {
		
		var list = Bread.getBreadList();
		Optional<Bread> bread = list.stream()
				.min( Comparator.comparing(Bread::price)); //値段を比較し最小値を取得
		System.out.println(bread.orElseGet(Bread::new));  //値を返す
	}

}
