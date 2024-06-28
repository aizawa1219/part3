package chapter18_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Sample3 {

	public static void main(String[] args) {
		
		var list = new ArrayList<Measurement>();  //レコードを入れるリスト
		var path = Path.of("sample.txt");   //Pathオブジェクト作成
		try(var in = Files.newBufferedReader(path)){ //リソース（close()が必要なオブジェクトのこと）作成
			String line;
			while((line=in.readLine())!=null) {   //1行分の読み出し
				String[]items = line.split("\\s*,\\s*");  //Stringの配列に分割
				list.add(new Measurement(items));  //レコードをリストに追加する
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		list.forEach(System.out::println);  //リストのすべての要素を表示する
	}

}
