package chapter16_2;

import jp.kwebs.lib.Input;

public class Sample1 {

	public static void main(String[] args) {
		String reg = "^(?=.\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20}$";
		String s = Input.getString("パスワード");
		System.out.println(s.matches(reg));
	}

}
