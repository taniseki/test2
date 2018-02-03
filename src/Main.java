import human.Human;
import money.Money;
import money.TenYen;
import vendingMachine.VendingMachine;

public class Main {

	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine();
		Human human = new Human();
		//vendingMachine.moneyCount(human.action());
		human.action();


		boolean isExit = false;
		while(!isExit){
			Object humanActNum = human.action();
			human.action();

			//	自販機用
			if(humanActNum instanceof Money){
				System.out.println(TenYen.TEN_YEN);
			}


		}


	}
}
