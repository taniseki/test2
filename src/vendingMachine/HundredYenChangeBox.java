package vendingMachine;

import java.util.List;

import money.HundredYen;

public class HundredYenChangeBox implements ChangeBox{
	protected List<HundredYen> stock;

	public void addStock(HundredYen hundredYen){
		stock.add(hundredYen);
	}

	public HundredYen getHundredYen(){

		if(this.stock.size() > 0){
			return this.stock.remove(0);
		}

		System.out.println("おつりがありません");
		return null;
	}

	/**
	 * @return stock
	 */
	public List<HundredYen> getStock() {
		return stock;
	}

	/**
	 * @param stock セットする stock
	 */
	public void setStock(List<HundredYen> stock) {
		this.stock = stock;
	}
}
