package LiveStudy._15Week;

@FunctionalInterface
interface Setting {
	void setup();
}

public class LeagueOfLegend {
	public void running(Setting setting) {
		setting.setup();
		System.out.println("LeagueOfLegend running");
	}
}
