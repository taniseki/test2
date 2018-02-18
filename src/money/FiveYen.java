package money;

public class FiveYen extends Yen implements Coin {
	/**
	 * 金額
	 */
	public static final int FIVE_YEN = 5;

	/**
	 * コンストラクタ
	 */
	public FiveYen() {
		super.setAmount(FIVE_YEN);
	}
}
