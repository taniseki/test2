package first;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//購入商品
		String item = "";

		System.out.println(Message.INPUT_MONEY);
		System.out.println(Message.SELECT_MONEY);

		int money = 0;
		money = InputMoney.inputMoney(sc);


		System.out.println(Message.SELECT_ITEM);
		System.out.println(Message.COLA);
		System.out.println(Message.CIDER);
		System.out.println(Message.CAFFEE);

		item = SelectItem.selectItem(sc);

		System.out.println(item + Message.YOUR_SELECT_ITEM);

		for(int i =0;i<=0;i += 0){
//			Scanner sc ;
//			sc = new Scanner(System.in);

			if(money >=120){
				System.out.println(item + Message.YOUR_BUY);
				sc.close();
				i += 1;
			}else{
				System.out.println(Message.INSUFFICIENT_MONEY);
				money += sc.nextInt();
				i += 0;

			}
		}
	}

}
