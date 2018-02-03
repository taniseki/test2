import human.Human;
import vendingMachine.VendingMachine;

public class Main {

	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine();
		Human human = new Human();
		vendingMachine.moneyCount(human.action());
		human.action();
	}
}
