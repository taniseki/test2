import beverage.Item;
import human.Human;
import vendingMachine.VendingMachine;

public class Controler {
	private VendingMachine vm = new VendingMachine();
	private Human human = new Human();

	public void buy() {
		// お金を入れる
		vm.checkMoney(human.insertMoney());
		vm.checkMoney(human.insertMoney());
		// 買える商品を表示
		vm.canBuyItemDisp();
		// 引数で商品選択
		Item drink = vm.pushBottun(2);
		if(drink == null) {
			return;
		}
	}

	public void select() {

	}
}
