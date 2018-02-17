import beverage.Item;
import human.Human;
import vendingMachine.VendingMachine;

public class Controler {
	private VendingMachine vm = new VendingMachine();
	private Human human = new Human();

	public void buy() {
		// お金を入れる
		vm.checkMoney(human.insertMoney());
		// 買う
		Item drink = vm.pushBottun();
		if(drink == null) {
			return;
		}
		System.out.println(drink.getName() + "を購入しました");
	}
}
