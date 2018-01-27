package money;

public class TenYen extends Yen implements Coin {
	public static final int TEN_YEN = 10;
	public TenYen() {
		super.amount = TEN_YEN;
	}
}
