package chapter14_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;

public class Sample7 {

	public static void main(String[] args) {
		
		try {
			Path p = Path.of("_fruit.txt");
			var list = Files.readAllLines(p);
			list.forEach(System.out::println);
		} 
		catch (NoSuchFileException e) {
			System.err.println(e + "\nファイルがありません");
		}
		catch (IOException e) {
			System.err.println(e + "\nファイルを読み出せません");
		}
		
	}

}
