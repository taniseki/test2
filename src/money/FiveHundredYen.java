package money;

public class FiveHundredYen extends Yen implements Coin {
	/**
	 * 金額
	 */
	public static final int FIVE_HUNDRED_YEN = 500;

	/**
	 * コンストラクタ
	 */
	public FiveHundredYen() {
		super.setAmount(FIVE_HUNDRED_YEN);
	}
}
