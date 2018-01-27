package money;

public class FiftyYen extends Yen implements Coin {
	public static final int FIFTY_YEN = 50;
	public FiftyYen() {
		super.amount = FIFTY_YEN;
	}
}
