package programrepairtest;

public class B {

	private boolean mPrivateBoolean;
	
	public B() {
		mPrivateBoolean = true;
	}
	
	public boolean getPrivateBoolean() {
		return mPrivateBoolean;
	}
	
	public void setPrivateBoolean(boolean value) {
		mPrivateBoolean = value;
	}
	
	public boolean inversePrivateBoolean() {
		return !mPrivateBoolean;
	}
}
