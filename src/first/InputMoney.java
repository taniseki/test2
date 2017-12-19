package first;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 金額を判定するクラス
 * @author Tanigawa
 *
 */
public class InputMoney {

	public static int inputMoney() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int money = 0;
		try {
			money = new Integer(in.readLine());
		} catch (Exception e) {
			System.out.println(Message.PLEASE_NUMBER);
			return money;
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
