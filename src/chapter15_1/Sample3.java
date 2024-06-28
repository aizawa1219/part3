package chapter15_1;

public class Sample3 {

	public static void main(String[] args) {
		for(Size s : Size.values()) {
			System.out.println(s.name() + ":" + s.ordinal());
		}
	}

}
