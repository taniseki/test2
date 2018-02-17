package human;

import money.Money;
import money.TenYen;

public class Human {
	/**
	 * お金
	 */
	private Money money= new TenYen();

	/**
	 * @return money
	 */
	public Money insertMoney() {
		return this.money;
	}
}
