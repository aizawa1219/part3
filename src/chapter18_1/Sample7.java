package chapter18_1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import jp.kwebs.lib.Input;

public class Sample7 {

	public static void main(String[] args) {
		
		try(var out = new PrintWriter(new FileWriter("output.txt", true))){
			int id;
			while((id=Input.getInt("id"))!=0) {
				String name = Input.getString("氏名");
				double weight = Input.getDouble("体重");
				double height = Input.getDouble("身長");
				
				out.printf("%d,%s,%.1f,%.1f%n",id, name, weight, height);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
