package money;

public class HundredYen extends Yen implements Coin {
	/**
	 * 金額
	 */
	public static final int HUNDRED_YEN = 100;

	/**
	 * コンストラクタ
	 */
	public HundredYen() {
		super.setAmount(HUNDRED_YEN);
	}
}
