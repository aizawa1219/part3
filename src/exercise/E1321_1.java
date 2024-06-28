package exercise;

public class E1321_1 {

	public static void main(String[] args) {
		
		var list = Bread.getBreadList();
		
		list.stream()
			.filter(e->e.country().equals("日本"))
			.forEach(System.out::println);
	}

}
