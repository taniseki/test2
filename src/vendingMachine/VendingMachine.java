package vendingMachine;

import beverage.CocaCola500ml;
import beverage.Item;
import money.Coin;
import money.Money;
import money.Yen;

public class VendingMachine {
	/**
	 * 今入ってるお金
	 */
	private int amount = 0;
	/**
	 * 商品（コーラ）
	 */
	private Item cola = new CocaCola500ml();

	/**
	 * お金チェック
	 *
	 * @param money
	 */
	public void checkMoney(Money money) {
		// お金かチェック
		if(money instanceof Yen && money instanceof Coin) {
			this.amount += money.amount;
		}
		System.out.println("現在の金額 : ¥" + this.amount);
	}

	/**
	 * ドリンクを返却
	 *
	 * @return 買った飲み物
	 */
	public Item pushBottun() {
		if(this.amount >= this.cola.getAmount()) {
			return cola;
		}
		return null;
	}
}
