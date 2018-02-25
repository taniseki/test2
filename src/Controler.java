import beverage.Item;
import human.Human;
import money.Bill;
import money.Coin;
import money.Money;
import vendingMachine.VendingMachine;

public class Controler {
	private VendingMachine vm = new VendingMachine();
	private Human human = new Human();

	public void buy() {
		// お金を入れる
		for(Money money : human.getMoney()) {
			if(money instanceof Coin) {
				vm.checkCoinMoney(money);
			} else if (money instanceof Bill) {
				vm.checkBillMoney(money);
			}
		}
		// 買える商品を表示
		vm.canBuyItemDisp();
		// 引数で商品選択
		Item drink = vm.pushBottun(0);
		if(drink == null) {
			return;
		}
	}

	public void select() {

	}
}
