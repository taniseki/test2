package vendingMachine;

import java.util.List;

import money.FiveHundredYen;

public class FiveHundredYenChangeBox implements ChangeBox{
	protected List<FiveHundredYen> stock;

	public void addStock(FiveHundredYen fiveFiveHundredYen){
		stock.add(fiveFiveHundredYen);
	}

	public FiveHundredYen getFiveHundredYen(){

		if(this.stock.size() > 0){
			return this.stock.remove(0);
		}

		System.out.println("おつりがありません");
		return null;
	}

	/**
	 * @return stock
	 */
	public List<FiveHundredYen> getStock() {
		return stock;
	}

	/**
	 * @param stock セットする stock
	 */
	public void setStock(List<FiveHundredYen> stock) {
		this.stock = stock;
	}
}
