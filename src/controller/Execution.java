package controller;

/**
 * コントローラ実行クラス.<br>
 */
public class Execution {
	/**
	 * コントローラ.<br>
	 */
	private static AbstractController currentController;

	/**
	 * コントローラ実行.<br>
	 * Topを実行する
	 */
	public static void exec() {
		currentController = new Top();
		displayDescription(currentController);
		currentController.control();
	}

	/**
	 * コントローラ実行.<br>
	 * 引数のコントローラを実行する
	 *
	 * @param paramController
	 */
	public static void exec(AbstractController paramController) {
		currentController = paramController;
		displayDescription(currentController);
		currentController.control();
	}

	/**
	 * コントローラの説明文を表示する.<br>
	 *
	 * @param Controller
	 */
	private static void displayDescription(AbstractController Controller) {
		for(int i = 0; i < Controller.getDescription().length; i++) {
			if(i==0) {
				System.out.println(Controller.getDescription()[i]);
			} else {
				System.out.println(i + " : " + Controller.getDescription()[i]);
			}
		}
		if(!(Controller instanceof Top)) {
			System.out.println("0 : Topに戻る");
		}
	}
}
