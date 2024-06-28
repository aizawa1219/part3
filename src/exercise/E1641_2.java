package exercise;

import jp.kwebs.lib.Input;

public class E1641_2 {

	public static void main(String[] args) {
		String reg = "^(ab|cc)2[0-9]\\d{4}$";
		String s = Input.getString("学籍番号");
		System.out.println(s.matches(reg));
	}

}

