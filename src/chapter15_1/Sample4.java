package chapter15_1;
import java.util.Arrays;
public class Sample4 {

	public static void main(String[] args) {
		Size[] ss = {Size.MEDIUM, Size.LARGE, Size.SMALL};
		Arrays.sort(ss);
		for(Size s : ss) {
			System.out.println(s.name() + ":" + s.ordinal());
		}
	}

}
