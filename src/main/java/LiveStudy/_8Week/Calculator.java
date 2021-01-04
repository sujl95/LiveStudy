package LiveStudy._8Week;

public interface Calculator {
	int plus(int i , int j);
	int multiple(int i, int j);
	default int exec(int i, int j) {
		return i + j;
	}
	public static int exec2(int i , int j) {
		return i * j;
	}
}
