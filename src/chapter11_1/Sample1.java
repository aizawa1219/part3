package chapter11_1;

public class Sample1 {

	public static void main(String[] args) {
		
		Tax tax = new Tax(100, "田中宏", 150);
		int zei = tax.zeigaku(gaku -> gaku >100 ? 0.1 : 0.05);  //ラムダ式に書き換え
		System.out.println(tax.getName() + "\t" + zei);
	}

}
