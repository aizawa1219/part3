package chapter18_1;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class Sample5 {

	public static void main(String[] args) {
		
		var list = new ArrayList<Measurement>();  //レコードを入れるリスト
		var path = Path.of("sample.txt");   //Pathオブジェクト作成
		try(var sc = new Scanner(path)){ //リソース（close()が必要なオブジェクトのこと）作成
			sc.useDelimiter("(\\s*,\\s*)|(\\s+)");
			while(sc.hasNext()) {   //項目が残っていたらtrueを返す
				list.add(new Measurement(sc.nextInt(),sc.next(),
						sc.nextDouble(), sc.nextDouble()));
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		list.forEach(System.out::println);  //リストのすべての要素を表示する
		
	}

}
