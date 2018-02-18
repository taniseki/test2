package money;

public class FiftyYen extends Yen implements Coin {
	/**
	 * 金額
	 */
	public static final int FIFTY_YEN = 50;

	/**
	 * コンストラクタ
	 */
	public FiftyYen() {
		super.setAmount(FIFTY_YEN);
	}
}
