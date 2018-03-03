package vendingMachine;

import money.HundredYen;

public class HundredYenChangeBox implements ChangeBox{
	private HundredYen[] stock = new HundredYen[100];

	public void addStock(HundredYen hundredYen) {

		for (int i = 0; i < stock.length; i++) {
			if (stock[i] == null) {
				stock[i] = hundredYen;
				break;
			}
		}
	}

	public HundredYen getHundredYen() {

		HundredYen hundredYen = null;
		for (int i = stock.length; i > 0; i--) {
			if (stock[i] != null) {
				hundredYen = stock[i];
				stock[i] = null;
				break;
			}
		}
		return hundredYen;
	}

	/**
	 * @return stock
	 */
	public HundredYen[] getStock() {
		return stock;
	}

	/**
	 * @param stock セットする stock
	 */
	public void setStock(HundredYen[] stock) {
		this.stock = stock;
	}

}
