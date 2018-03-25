package controller;

import money.FiveHundredYen;
import money.HundredYen;
import money.Money;

public class InsertCoin_2 extends AbstractController {
	/** コントローラ説明文 */
	static public final String DESCRIPTION = "何を行いますか？";
		/** 説明文1 */
	static public final String DESCRIPTION1 = "100円を入れる";
	/** 説明文2 */
	static public final String DESCRIPTION2 = "500円を入れる";
	/** 説明文3 */
	static public final String DESCRIPTION3 = "おつりを貰う";
	/** 説明文4 */
	static public final String DESCRIPTION4 = "メニュー１へ";

	/**
	 * コンストラクタ
	 */
	InsertCoin_2(){
		super(DESCRIPTION,DESCRIPTION1,DESCRIPTION2,DESCRIPTION3,DESCRIPTION4);
	}

	/**
	 * staticなfieldに格納させている自販機インスタンスを、getして使用する
	 * 現在は人間クラスができていないので、100円インスタンスをそのまま使用
	 * 100円を入れる
	 */
	@Override
	protected void one(){
		if(AbstractController.field == null) {
			System.out.println("フィールドがありません。");
			return;
		}
		if(AbstractController.field.getVendingMachine() == null) {
			System.out.println("自動販売機がありません。");
			return;
		}
		Money money = new HundredYen();
		AbstractController.field.getVendingMachine().checkCoinMoney(money);
	}

	/**
	 * 500円を入れる
	 */
	@Override
	protected void two(){
		if(AbstractController.field == null) {
			System.out.println("フィールドがありません。");
			return;
		}
		if(AbstractController.field.getVendingMachine() == null) {
			System.out.println("自動販売機がありません。");
			return;
		}
		Money money = new FiveHundredYen();
		AbstractController.field.getVendingMachine().checkCoinMoney(money);
	}

	/**
	 * おつりを貰う
	 */
	@Override
	protected void three(){
		if(AbstractController.field == null) {
			System.out.println("フィールドがありません。");
			return;
		}
		if(AbstractController.field.getVendingMachine() == null) {
			System.out.println("自動販売機がありません。");
			return;
		}

	}

	/**
	 * メニュー１へ
	 */
	@Override
	protected void four(){
		Execution.exec(new InsertCoin());
	}
}
