package chapter16_1;

public class Reg {

	public static void test(String reg, String... strs) {
		String sb = reg + "		";
		for(String s : strs) {  //strsは文字列が格納されている？
			boolean match = s.matches(reg);
			sb += (match ? "〇" : "×") + s + "		";
		}
		System.out.println(sb);
	}

}
