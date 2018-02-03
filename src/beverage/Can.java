package beverage;

public class Can extends Container {

	public static final int capacity = 190;

	Can(){
		super.setCapacity(capacity);
	}

	@Override
	void open() {
			System.out.println("プルタブをひっぱる");

	}

	@Override
	void trash() {
		System.out.println();
	}


}
