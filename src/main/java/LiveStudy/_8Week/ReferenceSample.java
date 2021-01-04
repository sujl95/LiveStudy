package LiveStudy._8Week;

public class ReferenceSample {
	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();

		dog.cry();
		cat.cry();

		// dog.name(); 사용 X
		// cat.name(); 사용 X
		((Dog)dog).name(); // 사용 O
		((Cat)cat).name(); // 사용 O


	}
}
