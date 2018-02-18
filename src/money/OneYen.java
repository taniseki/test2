package money;

public class OneYen extends Yen implements Coin {
	/**
	 * 金額
	 */
	public static final int ONE_YEN = 1;

	/**
	 * コンストラクタ
	 */
	public OneYen() {
		super.setAmount(ONE_YEN);
	}
}
