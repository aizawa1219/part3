package chapter19_1;

public class Sample5 {

	public static void main(String[] args) {
		var count = new Count();		//共有フィールド
		for(int i=0; i<5; i++) {		//5つのスレッドを生成する
			new Thread(() -> count.update()).start();//update()を実行する
		}
	}

}

class Count{
	private int number=0;		//共有フィールド
	public synchronized void update() {
		number++;				//1増やす
		Tools.sleep(1);			//休止
		Tools.print(number);	//現在の値を表示
	}
}
