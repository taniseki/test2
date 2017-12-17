package first;

import java.util.Scanner;

/**
 * 金額を判定するクラス
 * @author Tanigawa
 *
 */
public class InputMoney {

	public static int inputMoney(Scanner sc) {
		int money = 0;
		try {
			money = sc.nextInt();
		} catch (Exception e) {
			System.out.println(Message.PLEASE_NUMBER);
			System.exit(1);
		}
		if(money % 10 != 0){
			System.out.println(Message.NOT_MONEY);
			System.exit(1);
			return 0;
		}else{
			return money;
		}
	}

}
