package vendingMachine;

import money.TenYen;

/**
 * 10円おつり箱クラス
 * @author masakazu seki
 *
 */
public class TenYenChangeBox implements ChangeBox {
	/**
	 * 10円のおつり箱
	 */
	private TenYen[] stock = new TenYen[100];

	/**
	 * TenYenのインスタンスを受け取り、おつり箱にいれる
	 */
	public void addStock(TenYen tenYen) {

		for (int i = 0; i < stock.length; i++) {
			if (stock[i] == null) {
				stock[i] = tenYen;
				break;
			}
		}
	}


	/**
	 * おつり箱にあるおつりをすべて返す。
	 * @return tenYen
	 */
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

}
