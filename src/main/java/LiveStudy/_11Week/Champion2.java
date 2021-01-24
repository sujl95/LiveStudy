package LiveStudy._11Week;

public enum Champion2 {
	NIDALEE("창 투척"), MASTERYI("알파 스트라이크"), YUMI("샤르르탄");

	private final String skill;

	Champion2(String skill) {
		this.skill = skill;
	}

	public String getSkill() {
		return skill;
	}
}
