package LiveStudy._8Week;

public class TestImpl implements ITest{
	@Override
	public void abstractMethod() {
		System.out.println("abstractMethod");
	}

	@Override
	public void nonAbstractMethod() {
		System.out.println("nonAbstractMethod");
	}
}
