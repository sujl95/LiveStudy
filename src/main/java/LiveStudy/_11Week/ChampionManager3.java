package LiveStudy._11Week;

import java.util.Arrays;

public class ChampionManager3 {
	public static void main(String[] args) {
		Champion2[] list = Champion2.values();
		Arrays.stream(list).forEach(System.out::println);
	}
}
