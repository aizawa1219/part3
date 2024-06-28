package chapter18_1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Sample8 {

	public static void main(String[] args) {
		
		List<Path> list = null;
		var path = Path.of("C:/root");
		
		try(var path_stream = Files.walk(path)){
			list = path_stream
					.filter(p -> Files.isRegularFile(p))
					.toList();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		list.forEach(System.out::println);
	}

}
