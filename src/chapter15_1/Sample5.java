package chapter15_1;

public class Sample5 {

	public static void main(String[] args) {
		var a = Size.SMALL;
		System.out.println(a == Size.LARGE);
		System.out.println(a != Size.LARGE);
		System.out.println(a.equals(Size.LARGE));
	}

}
