package vendingMachine;

import java.util.List;

import money.FiftyYen;

public class FiftyYenChangeBox implements ChangeBox{
	protected List<FiftyYen> stock;

	public void addStock(FiftyYen fiftyYen){
		stock.add(fiftyYen);
	}

	public FiftyYen getFiftyYen(){

		if(this.stock.size() > 0){
			return this.stock.remove(0);
		}

		System.out.println("おつりがありません");
		return null;
	}

	/**
	 * @return stock
	 */
	public List<FiftyYen> getStock() {
		return stock;
	}

	/**
	 * @param stock セットする stock
	 */
	public void setStock(List<FiftyYen> stock) {
		this.stock = stock;
	}
}
