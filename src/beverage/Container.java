package beverage;

public abstract class Container {
	private int capacity;
	/**
	 * @return capacity
	 */
	public int getCapacity() {
		return capacity;
	}
	/**
	 * @param capacity セットする capacity
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}



	abstract void open();
	abstract void trash();
}
