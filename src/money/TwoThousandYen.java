package money;

public class TwoThousandYen extends Yen implements Bill {
	/**
	 * 金額
	 */
	public static final int TWO_THOUSAND_YEN = 2000;

	/**
	 * コンストラクタ
	 */
	public TwoThousandYen() {
		super.setAmount(TWO_THOUSAND_YEN);
	}
}
