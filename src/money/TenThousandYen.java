package money;

public class TenThousandYen extends Yen implements Bill {
	/**
	 * 金額
	 */
	public static final int TEN_THOUSAND_YEN = 10000;

	/**
	 * コンストラクタ
	 */
	public TenThousandYen() {
		super.setAmount(TEN_THOUSAND_YEN);
	}
}
