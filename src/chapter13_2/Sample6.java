package chapter13_2;

import java.util.List;

record Department(String name, List<String> employees) {}

public class Sample6 {

	public static void main(String[] args) {
		
		var list = List.of(
				new Department("総務", List.of("田中", "木村")),
				new Department("経理", List.of("佐藤", "山田")),
				new Department("営業", List.of("山本", "藤田", "斎藤"))  );
		
		list.stream()
			.map(Department::employees)
			.flatMap(List::stream)
			.forEach(e -> System.out.print(e + " "));
	}

}
