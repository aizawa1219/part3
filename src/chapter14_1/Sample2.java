package chapter14_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Sample2 {

	public static void main(String[] args) {
		try {
			Path p = Path.of("fruit.txt");    //Pathを作成
			var in = Files.newBufferedReader(p); //リーダーを作成
			System.out.println(in.readLine()); //1行分を読みだして表示する
		} 
		catch (IOException e) {
			System.err.println(e + "\nファイルを読み出せません");
		}
//		finally {
//			in.close();		//リーダーを閉じる
//		}
	}

}
