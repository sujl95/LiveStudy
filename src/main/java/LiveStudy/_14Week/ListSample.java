package LiveStudy._14Week;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSample {
	public static <T> void sort(List<T> list, Comparator<? super T> comparator) {
	}

	public static void main(String[] args) {
		// List<Object> list = new ArrayList<Integer>(); //compile error
		// list.add("thewing"); // type 이 일치하지 않아 add가 안된다
	}
}
