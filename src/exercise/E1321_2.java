package exercise;

public class E1321_2 {

	public static void main(String[] args) {
		var list = Bread.getBreadList();
		
		list.stream()
			.filter(e->e.soldout()==true)
			.map(Bread::name)  //パンの名前だけを取り出す
			.forEach(System.out::println);
	}

}
