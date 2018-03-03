package controller;

import field.Field;
import human.Human;
import vendingMachine.VendingMachine;

public class Create extends AbstractController {
	/** コントローラ説明文 */
	static public final String DESCRIPTION = "生成するオブジェクトを選択してください。";
	/** 説明文１ */
	static public final String DESCRIPTION1 = "フィールドを生成";
	/** 説明文２ */
	static public final String DESCRIPTION2 = "人間を生成";
	/** 説明文３ */
	static public final String DESCRIPTION3 = "自動販売機を生成";

	/**
	 * コンストラクタ
	 */
	Create() {
		super(DESCRIPTION, DESCRIPTION1, DESCRIPTION2);
	}

	/**
	 * フィールドを生成.<br>
	 *
	 * @see controller.AbstractController#one()
	 */
	@Override
	protected void one() {
		AbstractController.field = new Field();
		System.out.println("フィールドを生成");
	}

	/**
	 * 自動販売機を生成.<br>
	 *
	 * @see controller.AbstractController#two()
	 */
	@Override
	protected void two() {
		if(AbstractController.field == null) {
			System.out.println("フィールドがありません。");
			return;
		}
		AbstractController.field.setVendingMachine(new VendingMachine());
		System.out.println("自動販売機を生成");

	}

	/**
	 * 人間を生成.<br>
	 *
	 * @see controller.AbstractController#two()
	 */
	@Override
	protected void three() {
		if(AbstractController.field == null) {
			System.out.println("フィールドがありません。");
			return;
		}
		AbstractController.field.setHuman(new Human());
		System.out.println("人間を生成");
	}
}
