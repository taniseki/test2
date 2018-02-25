package human;

import java.util.ArrayList;
import java.util.List;

import money.FiftyYen;
import money.FiveHundredYen;
import money.FiveThousandYen;
import money.FiveYen;
import money.HundredYen;
import money.Money;
import money.OneYen;
import money.TenThousandYen;
import money.TenYen;
import money.ThousandYen;
import money.TwoThousandYen;

public class Human {
	/**
	 * 所持金
	 */
	private List<Money> money = new ArrayList<>();

	public Human() {
		setMoney();
	}

	/**
	 * お金を持たせる
	 */
	public void setMoney() {
		this.money.add(new OneYen());
		this.money.add(new FiveYen());
		this.money.add(new TenYen());
		this.money.add(new FiftyYen());
		this.money.add(new HundredYen());
		this.money.add(new FiveHundredYen());
		this.money.add(new ThousandYen());
		this.money.add(new TwoThousandYen());
		this.money.add(new FiveThousandYen());
		this.money.add(new TenThousandYen());
	}

	/**
	 * @return money
	 */
	public Money insertMoney() {
		if(this.money.size() > 0) {
			return this.money.remove(0);
		}
		System.out.println("お金がありません");
		return null;
	}

	/**
	 * @return money
	 */
	public List<Money> getMoney() {
		return money;
	}

	/**
	 * @param money セットする money
	 */
	public void setMoney(List<Money> money) {
		this.money = money;
	}
}
