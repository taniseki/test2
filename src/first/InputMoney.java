package first;

import java.util.Scanner;

/**
 * 金額を判定するクラス
 * @author Tanigawa
 *
 */
public class InputMoney {

	public static int inputMoney() {
		Scanner sc = new Scanner(System.in);
		int money = 0;
		try {
			money = sc.nextInt();
		} catch (Exception e) {
			System.out.println("数字を入力してください");
			System.exit(1);
		} finally {
			sc.close();
		}
		if(money % 10 != 0){
			System.out.println("認識できないお金です");
			System.exit(1);
			return 0;
		}else{
			return money;
		}
	}

}
