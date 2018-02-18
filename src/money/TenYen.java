package money;

public class TenYen extends Yen implements Coin {
	/**
	 * 金額
	 */
	public static final int TEN_YEN = 10;

	/**
	 * コンストラクタ
	 */
	public TenYen() {
		super.setAmount(TEN_YEN);
	}
}
