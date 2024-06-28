package chapter18_1;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

public class Sample2 {

	public static void main(String[] args) {
		var path = Path.of("sample_ms932.txt");
		var cs = Charset.forName("MS932");
		try(var in = Files.newBufferedReader(path, cs)){ 
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
