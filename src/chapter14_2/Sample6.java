package chapter14_2;

import chapter14_1.IllegalCharException;
import jp.kwebs.lib.Input;

public class Sample6 {

	public static void main(String[] args) {
		
		String str = Input.getString();
		try {
			analyse(str);
			System.out.println("OK " + str);
		}
		catch(IllegalCharException e) {
			System.out.println(e);
		}
		catch(FormatException e) {
			System.out.println(e);
		}
	}
	
	public static void analyse(String str) throws IllegalCharException,FormatException {  //可能性のある例外を宣言する。catchでキャッチする
		if(str.contains("@")) {
			throw new IllegalCharException("@は使えません");
		}
		if(!str.endsWith("/")) {
			throw new FormatException("末尾に/がありません");
		}
		
	}

}
