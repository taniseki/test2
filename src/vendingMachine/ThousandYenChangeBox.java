package vendingMachine;

import money.ThousandYen;

public class ThousandYenChangeBox implements ChangeBox{
	private ThousandYen[] stock = new ThousandYen[100];

	public void addStock(ThousandYen thousandYen) {

		for (int i = 0; i < stock.length; i++) {
			if (stock[i] == null) {
				stock[i] = thousandYen;
				break;
			}
		}
	}

	public ThousandYen getThousandYen() {

		ThousandYen thousandYen = null;
		for (int i = stock.length; i > 0; i--) {
			if (stock[i] != null) {
				thousandYen = stock[i];
				stock[i] = null;
				break;
			}
		}
		return thousandYen;
	}

	/**
	 * @return stock
	 */
	public ThousandYen[] getStock() {
		return stock;
	}

	/**
	 * @param stock セットする stock
	 */
	public void setStock(ThousandYen[] stock) {
		this.stock = stock;
	}

}
