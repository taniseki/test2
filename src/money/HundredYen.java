package money;

public class HundredYen extends Yen implements Coin {
	public static final int HUNDRED_YEN = 100;
	public HundredYen() {
		super.amount = HUNDRED_YEN;
	}
}
