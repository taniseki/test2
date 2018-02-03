package human;

import java.util.Scanner;

public class Human {
	public void action() {
		Scanner scanner = new Scanner(System.in);
		String i = scanner.next();
		boolean isExit = false;
		while(!isExit) {
			switch(i) {
			case "1":
				// お金を取る
				takeMoney();
				break;
			case "2":
				// お金を入れる
				insertMoney();
				break;
			case "3":
				// ボタンを選んで押す
				pushButton();
				break;
			case "4":
				// 飲み物を取る

				break;
			case "5":
				// 飲み物を飲む
				takeDrink();
				break;
			case "6":

				break;
			case "7":

				break;
			case "8":

				break;
			default:
				isExit = true;
				scanner.close();
			}
		}
	}
}
