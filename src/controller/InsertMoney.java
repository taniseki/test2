/**
 *
 */
package controller;

import money.Bill;
import money.Coin;
import money.Money;
import money.Yen;

/**
 * おつり箱にお金を入れる
 * @author masakazu seki
 *
 */
public class InsertMoney extends AbstractController {
	/** コントローラ説明文 */
	static public final String DESCRIPTION = "何を行いますか？";
	/** 説明文１ */
	static public final String DESCRIPTION1 = "1円を入れる";
	/** 説明文2 */
	static public final String DESCRIPTION2 = "5円を入れる";
	/** 説明文3 */
	static public final String DESCRIPTION3 = "10円を入れる";
	/** 説明文4 */
	static public final String DESCRIPTION4 = "50円を入れる";
	/** 説明文5 */
	static public final String DESCRIPTION5 = "100円を入れる";
	/** 説明文6 */
	static public final String DESCRIPTION6 = "500円を入れる";
	/** 説明文7 */
	static public final String DESCRIPTION7 = "1000円を入れる";
	/** 説明文8 */
	static public final String DESCRIPTION8 = "5000円を入れる";
	/** 説明文9 */
	static public final String DESCRIPTION9 = "おつりを貰う";

	/**
	 * コンストラクタ
	 */
	InsertMoney(){
		super(DESCRIPTION,DESCRIPTION1,DESCRIPTION2,DESCRIPTION3,DESCRIPTION4
				,DESCRIPTION5,DESCRIPTION6,DESCRIPTION7,DESCRIPTION8,DESCRIPTION9);
	}


	protected void one(Money money){
		// nullであるかチェック
				if (money == null) {
					return;
				}
				// Coinであるかチェック
				if (!(money instanceof Coin)) {
					System.out.println("入りません");
					return;
				}
				// Yenであるかチェック
				if (!(money instanceof Yen)) {
					System.out.println("その硬貨は使えません");
					return;
				}
				// 1円または5円でないかチェック
				if (money.getAmount() == 1 || money.getAmount() == 5) {
					System.out.println("1円と5円は使えません");
					return;
				}
				
				//10円かチェック
				if(money.getAmount() == 10){
					
				}
				/*// 全てのチェックが通ればamountに追加
				this.amount += money.getAmount();
				System.out.println("現在の金額 : ¥" + this.amount);
*/			}

			/**
			 * お札チェック
			 *
			 * @param money
			 */
			public void checkBillMoney(Money money) {
				// Billであるかチェック
				if (!(money instanceof Bill)) {
					System.out.println("入りません");
					return;
				}
				// Yenであるかチェック
				if (!(money instanceof Yen)) {
					System.out.println("その紙幣は使えません");
					return;
				}
				// 1000円札であるかチェック
				if (money.getAmount() != 1000) {
					System.out.println("1000円札以外は使えません");
					return;
				}
				/*// 全てのチェックが通ればamountに追加
				this.amount += money.getAmount();
				System.out.println("入金額 : ¥" + this.amount);
*/	}

}
