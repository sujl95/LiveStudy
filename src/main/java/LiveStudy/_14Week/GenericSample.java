package LiveStudy._14Week;

class GenericSample<T> {
	T element;

	public static void main(String[] args) {
		GenericSample<Integer> integerGenericSample = new GenericSample<>();
		integerGenericSample.setElement(3);
		GenericSample<String> stringGenericSample = new GenericSample<>();
		stringGenericSample.setElement("test");
		System.out.println("integerGenericSample.getElement() = " + integerGenericSample.getElement());
		System.out.println("stringGenericSample.getElement() = " + stringGenericSample.getElement());
	}
	
	public void setElement(T element) {
		this.element = element;
	}
	public T getElement () {
		return element;
	}
	
}