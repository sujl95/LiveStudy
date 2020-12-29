package LiveStudy._7Week;

public class AccessCall {
	public static void main(String[] args) {
		AccessModifier accessModifier = new AccessModifier();
		accessModifier.publicMethod();
		accessModifier.protectedMethod(); //에러 : 같은 패키지 내이거나 상속받을 경우만 가능
		accessModifier.packagePrivateMethod(); //에러 : 같은 패키지 내에서만 가능
		// accessModifier.privateMethod(); //에러 : 해당 클래스에서만 가능
	}
}
