package chapter18_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Sample1 {

	public static void main(String[] args) {
		
		var path = Path.of("sample.txt");   //Pathオブジェクト作成
		try(var in = Files.newBufferedReader(path)){ //リソース（close()が必要なオブジェクトのこと）作成
			String line;
			while((line=in.readLine())!=null) {   //1行分の読み出し
				System.out.println(line);
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
