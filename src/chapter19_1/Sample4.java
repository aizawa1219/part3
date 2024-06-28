package chapter19_1;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Sample4 {

	public static void main(String[] args) {
		
ExecutorService pool = Executors.newFixedThreadPool(3);
		
		CompletableFuture
			.supplyAsync(() -> mailService(),pool)
			.exceptionally( throwable -> {
				Tools.print("エラーが発生しました\n" + throwable);
				return "エラーのため送信できませんでした";
			})
			.thenAccept( (message) -> sendReport(message));
		
		Tools.print("メールサービスに送信を依頼しました");
		pool.shutdown();
	}
	public static String mailService() {
		Tools.sleep(1000);   //1秒間休止
		int n = 10/0;
		return "送信：〇件、アドレス不正：〇件";
	}
	public static void sendReport(String message) {
		Tools.print(message);
	}

}
