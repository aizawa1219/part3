package chapter14_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Sample1 {

	public static void main(String[] args) {
		
		try {
			Path p = Path.of("_fruit.txt");    //Pathを作成
			var list = Files.readAllLines(p); //Listに読み出す
			list.forEach(System.out::println); //表示
		} 
		catch (IOException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
//			System.err.println(e + "\nファイルを読み出せません");
		}
		
		
	}

}
