package controller;

import java.util.Scanner;

import field.Field;

/**
 * コントローラ基底クラス.<br>
 * 各コントローラクラスは当クラスを継承する。
 */
public abstract class AbstractController {
	/**
	 * フィールド
	 */
	protected static Field field ;
	/**
	 * メソッドの説明文を格納する配列
	 */
	private String[] description;

	/**
	 * コンストラクタ.<br>
	 * 説明文を設定
	 */
	AbstractController(String... str) {
		this.description = str;
	}

	/**
	 * コントローラ
	 */
	public void control() {
		Scanner scanner = new Scanner(System.in);
		boolean isExit = false;
		while (!isExit) {
			switch (scanner.nextLine()) {
			case "1":
				one();
				break;
			case "2":
				two();
				break;
			case "3":
				three();
				break;
			case "4":
				four();
				break;
			case "5":
				five();
				break;
			case "6":
				six();
				break;
			case "7":
				seven();
				break;
			case "8":
				eight();
				break;
			case "9":
				nine();
				break;
			case "0":
				zero();
				break;
			default:
				scanner.close();
				isExit = true;
			}
		}
	}

	/** 子クラスでオーバーライドする */
	protected void one() {
	};

	protected void two() {
	};

	protected void three() {
	};

	protected void four() {
	};

	protected void five() {
	};

	protected void six() {
	};

	protected void seven() {
	};

	protected void eight() {
	};

	protected void nine() {
	};

	/** Topメニューに戻る */
	protected final void zero() {
		Execution.exec(new Top());
	}

	/**
	 * getter
	 * @return description
	 */
	public String[] getDescription() {
		return description;
	}
}
