package chapter15_1;

import jp.kwebs.lib.Input;

public class Sample6 {

	public static void main(String[] args) {
		
		String e = Input.getString().toUpperCase();
		Size s = Size.valueOf(e);
		
		switch(s) {
		case SMALL -> System.out.println(Size.SMALL);
		case MEDIUM -> System.out.println(Size.MEDIUM);
		default		-> System.out.println(Size.LARGE);
		}
	}

}
