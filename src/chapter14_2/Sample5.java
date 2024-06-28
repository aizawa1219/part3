package chapter14_2;

import chapter14_1.IllegalCharException;
import jp.kwebs.lib.Input;

public class Sample5 {

	public static void main(String[] args) {
		String str = Input.getString();
		try {
			analyse(str);
			System.out.println("OK " + str);
		}
		catch(IllegalCharException e) {
			System.out.println(e);
		}
	}
	public static void analyse(String str) throws IllegalCharException {  //可能性のある例外を宣言する。catchでキャッチする
		if(str.contains("@")) {
			throw new IllegalCharException("@は使えません");
		}
	}
}


