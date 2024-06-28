package chapter18_1;

import java.io.IOException;
import java.io.PrintWriter;

import jp.kwebs.lib.Input;

public class Sample6 {

	public static void main(String[] args) {
		
		try(var out = new PrintWriter("output.txt")){
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
