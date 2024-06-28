package chapter14_1;

public class IllegalCharException extends RuntimeException{
	private static final long serialVersionUID = 1L; //このクラスのバージョン番号です
	public IllegalCharException(String msg) {
		super(msg);
	}
	public IllegalCharException() {}
}
