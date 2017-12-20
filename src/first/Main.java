package first;

public class Main {


	public static void main(String[] args) {

		//購入商品
		String item = "";
		int money = 0;

		System.out.println(Message.INPUT_MONEY);
		System.out.println(Message.SELECT_MONEY);

		money = InputMoney.inputMoney();

		//ここに下にあるwhile文を持ってきたい。
		//その場合、上のInputMoney()メソッドはいらなくなる。

		System.out.println(Message.SELECT_ITEM);
		System.out.println(Message.COLA);
		System.out.println(Message.CIDER);
		System.out.println(Message.CAFFEE);

		item = SelectItem.selectItem();

		System.out.println(item + Message.YOUR_SELECT_ITEM);

		while(money < 120){
			System.out.println(Message.INSUFFICIENT_MONEY);
			money += InputMoney.inputMoney();
		}

		System.out.println(item + Message.YOUR_BUY);

	}

}
