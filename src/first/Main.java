package first;

public class Main {


	public static void main(String[] args) {

		//購入商品
		String item = "";
		int money = 0;

		System.out.println(Message.INPUT_MONEY);
		System.out.println(Message.SELECT_MONEY);

		while(money < 120){
			System.out.println(Message.INSUFFICIENT_MONEY);
			System.out.println(Message.WALLET + money);
			money = money + InputMoney.inputMoney();
		}

		while(item == ""){
			item = SelectItem.selectItem();
		}

		System.out.println(item + Message.YOUR_SELECT_ITEM);
		System.out.println(item + Message.YOUR_BUY);

	}

}
