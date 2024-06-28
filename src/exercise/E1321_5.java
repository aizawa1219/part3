package exercise;

public class E1321_5 {

	public static void main(String[] args) {
		var list = Bread.getBreadList();
		
		list.stream()
			.map(Bread::country)
			.distinct()
			.sorted()
			.forEach(System.out::println);
	}

}
