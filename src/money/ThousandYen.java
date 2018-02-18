package money;

public class ThousandYen extends Yen implements Bill {
	/**
	 * 金額
	 */
	public static final int THOUSAND_YEN = 1000;

	/**
	 * コンストラクタ
	 */
	public ThousandYen() {
		super.setAmount(THOUSAND_YEN);
	}
}
