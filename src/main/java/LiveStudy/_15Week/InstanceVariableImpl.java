package LiveStudy._15Week;

public class InstanceVariableImpl implements InstanceVariableCaptureInterface{
	private String name = "TheWing";

	@Override
	public void listen(Object o) {
		System.out.println(this.name);
	}
}
