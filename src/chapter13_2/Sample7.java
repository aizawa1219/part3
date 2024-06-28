package chapter13_2;

import java.util.List;

public class Sample7 {

	public static void main(String[] args) {
		var list = List.of(
				new Department("総務", List.of("田中", "木村")),
				new Department("経理", List.of("佐藤", "山田")),
				new Department("営業", List.of("山本", "藤田", "斎藤"))  );
		
		list.stream()
		.mapMulti((e, buf) -> {				//e(要素)、buf(変換バッファ)
			var Is = e.employees();			//Isは社員名のList
			Is.forEach(name->buf.accept(name));		//すべての社員名を変換バッファに登録
		})
		.forEach(name -> System.out.print(name + " "));
//		.mapMulti((e,huf)->e.employees().forEach(name->buf.accept(name))
//		.mapMulti((e,huf)->e.employees().forEach(buf::accept))
		
	}

}
