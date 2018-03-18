/**
 *
 */
package controller;

import money.FiftyYen;
import money.FiveYen;
import money.Money;
import money.OneYen;
import money.TenYen;

/**
 * おつり箱にお金を入れる(1)
 * @author masakazu seki
 *
 */
public class InsertCoin extends AbstractController {
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
	static public final String DESCRIPTION5 = "おつりを貰う";
	/** 説明文6 */
	static public final String DESCRIPTION6 = "メニュー２へ";


	/**
	 * コンストラクタ
	 */
	InsertCoin(){
		super(DESCRIPTION,DESCRIPTION1,DESCRIPTION2,DESCRIPTION3,DESCRIPTION4
				,DESCRIPTION5);
	}

	/**
	 * staticなfieldに格納させている自販機インスタンスを、getして使用する
	 * 現在は人間クラスができていないので、１円インスタンスをそのまま使用
	 * 一円を入れる
	 */
	@Override
	protected void one(){
		if(AbstractController.field.getVendingMachine() == null) {
			System.out.println("自動販売機がありません。");
			return;
		}
		Money money = new OneYen();
		AbstractController.field.getVendingMachine().checkCoinMoney(money);
	}

	/**
	 * 5円を入れる
	 */
	@Override
	protected void two(){
		Money money = new FiveYen();
		AbstractController.field.getVendingMachine().checkCoinMoney(money);
	}

	/**
	 * 10円を入れる
	 */
	@Override
	protected void three(){
		Money money = new TenYen();
		AbstractController.field.getVendingMachine().checkCoinMoney(money);
	}

	/**
	 * 50円を入れる
	 */
	@Override
	protected void four(){
		Money money = new FiftyYen();
		AbstractController.field.getVendingMachine().checkCoinMoney(money);
	}

	/**
	 * おつりを貰う
	 */
	@Override
	protected void five(){

	}

	/**
	 * メニュー2へ
	 */
	@Override
	protected void six(){

	}
}


