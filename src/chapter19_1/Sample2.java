package chapter19_1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sample2 {

	public static void main(String[] args) {
		
		ExecutorService pool = Executors.newFixedThreadPool(3);
		pool.submit(()->doTask(1));  //スレッドで実行
		pool.submit(()->doTask(2));
		pool.submit(()->doTask(3));
		pool.submit(()->doTask(4));
		pool.shutdown();   //プールを破棄
	}
	public static void doTask(int n) {
		Tools.sleep(1000);    		//	1秒間休止する
		Tools.print("task-" + n);   //実行情報を表示
	}

}
