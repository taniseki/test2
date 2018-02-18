package money;

public class FiveThousandYen extends Yen implements Bill {
	/**
	 * 金額
	 */
	public static final int FIVE_THOUSAND_YEN = 5000;

	/**
	 * コンストラクタ
	 */
	public FiveThousandYen() {
		super.setAmount(FIVE_THOUSAND_YEN);
	}
}
