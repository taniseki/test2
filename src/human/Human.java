package human;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import money.FiftyYen;
import money.Money;
import money.TenYen;

public class Human {
	/**
	 * 所持金
	 */
	private List<Money> money = new ArrayList<>(Arrays.asList(new TenYen(), new FiftyYen()));

	/**
	 * @return money
	 */
	public Money insertMoney() {
		if(this.money.size() > 0) {
			return this.money.remove(0);
		}
		return null;
	}
}
