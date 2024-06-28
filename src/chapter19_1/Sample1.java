package chapter19_1;

public class Sample1 {

	public static void main(String[] args) {
		var thread = new Thread(()->print());
		thread.start();
		System.out.println("メインスレッドの終了");
	}
	public static void print() {
		System.out.println("別のスレッドで実行しました");
	}

}
