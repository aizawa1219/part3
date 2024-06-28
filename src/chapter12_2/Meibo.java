package chapter12_2;

public record Meibo(int number, String name)implements Comparable<Meibo> {

	@Override
	public int compareTo(Meibo o) {
		return Integer.compare(number,o.number);
	}}
// numberにこれまでの番号が追加されていく。
// o.numberに来た新たに追加された番号とこれまでの番号を比較する