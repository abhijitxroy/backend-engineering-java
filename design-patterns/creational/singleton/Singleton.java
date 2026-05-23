

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;

	// private singleton instance
	private static Singleton instance;

	// private constructor
	private Singleton() {
	}

	// public method - create a single instance
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
