package vendingMachine;

import java.util.List;

import money.ThousandYen;

public class ThousandYenChangeBox implements ChangeBox{
	protected List<ThousandYen> stock;

	public void addStock(ThousandYen thousandYen){
		stock.add(thousandYen);
	}

	public ThousandYen getThousandYen(){

		if(this.stock.size() > 0){
			return this.stock.remove(0);
		}

		System.out.println("おつりがありません");
		return null;
	}

	/**
	 * @return stock
	 */
	public List<ThousandYen> getStock() {
		return stock;
	}

	/**
	 * @param stock セットする stock
	 */
	public void setStock(List<ThousandYen> stock) {
		this.stock = stock;
	}
}
