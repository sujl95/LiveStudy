package LiveStudy._11Week;

public class ChampionManager {
	public String getSkill(Champion champion){
		String skill = "";
		System.out.println(champion);
		switch (champion) {
			case NIDALEE:
				skill = "창 투척";
				break;
			case MASTERYI:
				skill = "알파 스트라이크";
				break;
			case YUMI:
				skill = "샤르르탄";
				break;
		}
		return skill;
	}

	public static void main(String[] args) {
		ChampionManager manager = new ChampionManager();
		String myAmount = manager.getSkill(Champion.NIDALEE);
		System.out.println(myAmount);
	}
}
