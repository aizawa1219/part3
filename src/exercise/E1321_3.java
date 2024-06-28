package exercise;

import java.util.Comparator;

public class E1321_3 {

	public static void main(String[] args) {
		var list = Bread.getBreadList();
		
		list.stream()
			.filter(e->e.country().equals("フランス"))
			.sorted(Comparator.comparing(Bread::price))
			.map(e -> e.name() + " " + e.price())
			.forEach(System.out::println);
	}

}
