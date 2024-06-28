package exercise;

import jp.kwebs.lib.Input;

public class E1641_1 {

	public static void main(String[] args) {
		String reg = "^\\d{3}-\\d{4}$";
		String s = Input.getString("郵便番号");
		System.out.println(s.matches(reg));
	}

}
