package exercise;

import java.util.Comparator;

public class E1321_4 {

	public static void main(String[] args) {
		var list = Bread.getBreadList();
		
		list.stream()
			.sorted(Comparator.comparing(Bread::price).reversed())
			.map(e -> e.name() + " " + e.price())
			.limit(3)
			.forEach(System.out::println);
	}

}
