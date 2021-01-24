package LiveStudy._11Week;

import java.util.EnumMap;

public class EnumMapSample {
	public static void main(String[] args) {
		EnumMap<Champion2, String> enumMap = new EnumMap<>(Champion2.class);
		System.out.println("enumMap = " + enumMap);

		enumMap.put(Champion2.NIDALEE, "숨통 끊기");
		enumMap.put(Champion2.MASTERYI, "명상");
		enumMap.put(Champion2.YUMI, "너랑 유미랑");

		System.out.println("enumMap put after= " + enumMap);

		enumMap.entrySet().forEach(System.out::println);
	}
}
