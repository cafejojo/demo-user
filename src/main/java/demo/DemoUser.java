package demo;

public class DemoUser {
	public void usageOne() {
		String s = new DemoLibrary().neverEmptyString();
		DemoLibrary.checkStringNotEmpty(s);
	}
	public void usageTwo() {
		char c = new DemoLibrary().alwaysBChar();
		DemoLibrary.checkCharIsB(c);
	}
	public void usageThree() {
		int i = new DemoLibrary().alwaysPositiveInt();
		DemoLibrary.checkIntIsPositive(i);
	}
	public void usageFour() {
		double d = new DemoLibrary().alwaysPositiveDouble();
		DemoLibrary.checkDoubleIsPositive(d);
	}
	public void usageFive() {
		boolean b = new DemoLibrary().alwaysTrueBoolean();
		DemoLibrary.checkBooleanIsTrue(b);
	}
}
