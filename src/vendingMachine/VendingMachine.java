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
	private Item cola = new CocaCola500ml();
	private boolean isCola = false;


	/**
	 * お金チェック
	 *
	 * @param money
	 */
	public void checkMoney(Money money) {
		// お金かチェック
		if(money instanceof Yen && money instanceof Coin) {
			amount += money.amount;
		}
		// お金が飲み物の代金より多ければボタンをアクティブにする
		if(amount >= 10) {
			this.isCola = true;
		}
	}

	/**
	 * ドリンクを返却
	 *
	 * @return 買った飲み物
	 */
	public Item pushBottun() {
		if(isCola) {
			return cola;
		}
		return null;
	}
}
