package vendingMachine;

import money.FiftyYen;
import money.HundredYen;
import money.Money;
import money.TenYen;

public class InsertMoney {



	/**
	 *
	 */
	public static Money selectMoney(int scanner) {
		switch (scanner) {
		case 1:
			return new TenYen();
		case 2:
			return new FiftyYen();
		case 3:
			return new HundredYen();
		default:
			return null;
		}
	}
}
