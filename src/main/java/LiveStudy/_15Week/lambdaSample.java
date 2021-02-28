package LiveStudy._15Week;

public class lambdaSample {
	public static void main(String[] args) {
		LeagueOfLegend leagueOfLegend = new LeagueOfLegend();
		leagueOfLegend.running(new Setting() {
			@Override
			public void setup() {
				System.out.println("leagueOfLegend is setup");
			}
		});
	}
}
