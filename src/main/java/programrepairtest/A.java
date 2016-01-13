package programrepairtest;

public class A {

	private int mPrivateInteger;
	private String mPrivateString;

	public A() {
		mPrivateInteger = 42;
		mPrivateString = "BEEF";
	}

	public int getPrivateInteger() {
		return 24;
	}

	public String getPrivateString() {
		return mPrivateString;
	}

	public int modulo42(int number) {
		return number % 42;
	}
}
