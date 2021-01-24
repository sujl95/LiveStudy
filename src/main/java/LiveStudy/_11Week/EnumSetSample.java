package LiveStudy._11Week;

import java.util.EnumSet;

public class EnumSetSample {
	public static void main(String[] args) {
		// Champion2 Enum 클래스 전체를 담는다
		EnumSet<Champion2> enumSetAllOf = EnumSet.allOf(Champion2.class);
		System.out.println("enumSet values = " + enumSetAllOf);

		// Champion2 의 빈 컬렉션을 만든다
		EnumSet<Champion2> enumSetNoneOf = EnumSet.noneOf(Champion2.class);
		System.out.println("enumSetNoneOf = " + enumSetNoneOf);

		// Enum의 하위 집합을 만드는 range()
		EnumSet<Champion2> enumSetRange = EnumSet.range(Champion2.MASTERYI, Champion2.YUMI);
		System.out.println("enumSetRange = " + enumSetRange);

		// 매개 변수로 전달 된 요소를 제외할 수 있다
		EnumSet<Champion2> enumSetComplementOf = EnumSet.complementOf(EnumSet.of(Champion2.NIDALEE, Champion2.MASTERYI));
		System.out.println("enumSetComplementOf = " + enumSetComplementOf);

		EnumSet<Champion2> enumSetCopyOf = EnumSet.copyOf(EnumSet.of(Champion2.NIDALEE, Champion2.YUMI));
		System.out.println("enumSetCopyOf = " + enumSetCopyOf);
	}
}
