package chapter14_2;

public class IllegalCharException extends Exception {
	private static final long serialVersionUID = 1L; //このクラスのバージョン番号です
	public IllegalCharException(String msg) {
		super(msg);
	}
	public IllegalCharException() {}
}
