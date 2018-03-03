package vendingMachine;

import money.FiveHundredYen;

public class FiveHundredYenChangeBox implements ChangeBox{
	private FiveHundredYen[] stock = new FiveHundredYen[100];

	public void addStock(FiveHundredYen fiveHundredYen) {

		for (int i = 0; i < stock.length; i++) {
			if (stock[i] == null) {
				stock[i] = fiveHundredYen;
				break;
			}
		}
	}

	public FiveHundredYen getFiveHundredYen() {

		FiveHundredYen fiveHundredYen = null;
		for (int i = stock.length; i > 0; i--) {
			if (stock[i] != null) {
				fiveHundredYen = stock[i];
				stock[i] = null;
				break;
			}
		}
		return fiveHundredYen;
	}

	/**
	 * @return stock
	 */
	public FiveHundredYen[] getStock() {
		return stock;
	}

	/**
	 * @param stock セットする stock
	 */
	public void setStock(FiveHundredYen[] stock) {
		this.stock = stock;
	}

}
