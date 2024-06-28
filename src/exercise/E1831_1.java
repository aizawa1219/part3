package exercise;

import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class E1831_1 {

	public static void main(String[] args) {
		
		var list = new ArrayList<Order>();  //レコードを入れるリスト
		var path = Path.of("order.txt");   //Pathオブジェクト作成
		try(var sc = new Scanner(path)){ //リソース（close()が必要なオブジェクトのこと）作成
			sc.useDelimiter("(\\s*,\\s*)|(\\s+)");
			while(sc.hasNext()) {   //項目が残っていたらtrueを返す
				list.add(new Order(sc.nextInt(),sc.next(),
						sc.nextInt(), LocalDate.parse(sc.next())));
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		list.forEach(System.out::println);  //リストのすべての要素を表示する
		
		
	}

}
