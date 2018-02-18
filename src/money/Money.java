package money;

public class Money {
	/**
	 * 金額
	 */
	private int amount;
	/**
	 * 通貨
	 */
	private String state;

	/**
	 * @return amount
	 */
	public int getAmount() {
		return amount;
	}
	/**
	 * @param amount セットする amount
	 */
	protected void setAmount(int amount) {
		this.amount = amount;
	}
	/**
	 * @return state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state セットする state
	 */
	protected void setState(String state) {
		this.state = state;
	}
}
