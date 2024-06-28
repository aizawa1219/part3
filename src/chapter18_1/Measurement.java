package chapter18_1;

public record Measurement(int id, String name, double weight, double height){
	
	public Measurement(String[] items) {
		this(Integer.valueOf(items[0]),		//id
				items[1],					//氏名
				Double.valueOf(items[2]),	//体重
				Double.valueOf(items[3]));	//身長
	}
}
