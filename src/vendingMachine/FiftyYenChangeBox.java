package vendingMachine;

import money.FiftyYen;

public class FiftyYenChangeBox implements ChangeBox{
	private FiftyYen[] stock = new FiftyYen[100];

	public void addStock(FiftyYen fiftyYen) {

		for (int i = 0; i < stock.length; i++) {
			if (stock[i] == null) {
				stock[i] = fiftyYen;
				break;
			}
		}
	}

	public FiftyYen getFiftyYen() {

		FiftyYen fiftyYen = null;
		for (int i = stock.length; i > 0; i--) {
			if (stock[i] != null) {
				fiftyYen = stock[i];
				stock[i] = null;
				break;
			}
		}
		return fiftyYen;
	}

	/**
	 * @return stock
	 */
	public FiftyYen[] getStock() {
		return stock;
	}

	/**
	 * @param stock セットする stock
	 */
	public void setStock(FiftyYen[] stock) {
		this.stock = stock;
	}

}
