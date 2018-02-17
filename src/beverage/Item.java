package beverage;

/**
 * @author TanigawaTetsuya
 *
 */
/**
 * @author TanigawaTetsuya
 *
 */
public class Item {
	/**
	 * 商品の名前
	 */
	private String name;
	/**
	 * 商品の価格
	 */
	private int amount;

	/**
	 * コンストラクタ
	 *
	 * @param name
	 * @param amount
	 */
	Item(String name, int amount) {
		this.name = name;
		this.amount = amount;
	}

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            セットする name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return amount
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            セットする amount
	 */
	public void setAmount(int amout) {
		this.amount = amout;
	}
}
