package chapter12_1;

import java.util.Arrays;
import java.util.Comparator;

public class NaturalSortExample {

	public static void main(String[] args) {
		var list
			= Arrays.asList("berry", "banana", "peach", "apple", "orange");
		
		list.sort(Comparator.naturalOrder());
		list.forEach(System.out::println);
	}

}
