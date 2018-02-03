package beverage;

public class Petbottles extends Container {
	/**
	 * 容量
	 */
	public static final int capacity = 500;

	Petbottles() {
		super.setCapacity(capacity);
	}

	@Override
	public void open() {
		System.out.println("キャップをまわす");
	}
	@Override
	public void trash() {
		System.out.println();
	}
}
