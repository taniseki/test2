package vendingMachine;

import money.TenYen;

public class TenYenChangeBox implements ChangeBox {
	private TenYen[] stock = new TenYen[100];

	public void addStock(TenYen tenYen) {

		for (int i = 0; i < stock.length; i++) {
			if (stock[i] == null) {
				stock[i] = tenYen;
				break;
			}
		}
	}

	public TenYen getTenYen() {

		TenYen tenYen = null;
		for (int i = stock.length; i > 0; i--) {
			if (stock[i] != null) {
				tenYen = stock[i];
				stock[i] = null;
				break;
			}
		}
		return tenYen;
	}

	/**
	 * @return stock
	 */
	public TenYen[] getStock() {
		return stock;
	}

	/**
	 * @param stock セットする stock
	 */
	public void setStock(TenYen[] stock) {
		this.stock = stock;
	}

}
