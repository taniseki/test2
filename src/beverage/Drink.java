package beverage;

public class Drink {
	int amount;
	int calorie;
	boolean carbonate;
	boolean alcohol;
	/**
	 * @return amount
	 */
	public int getAmount() {
		return amount;
	}
	/**
	 * @param amount セットする amount
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}
	/**
	 * @return calorie
	 */
	public int getCalorie() {
		return calorie;
	}
	/**
	 * @param calorie セットする calorie
	 */
	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	/**
	 * @return carbonate
	 */
	public boolean isCarbonate() {
		return carbonate;
	}
	/**
	 * @param carbonate セットする carbonate
	 */
	public void setCarbonate(boolean carbonate) {
		this.carbonate = carbonate;
	}
	/**
	 * @return alcohol
	 */
	public boolean isAlcohol() {
		return alcohol;
	}
	/**
	 * @param alcohol セットする alcohol
	 */
	public void setAlcohol(boolean alcohol) {
		this.alcohol = alcohol;
	}
}
