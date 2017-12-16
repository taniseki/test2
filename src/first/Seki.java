package first;

import java.util.Scanner;

public class Seki {

	public static void main(String[] args) {

		//購入商品
		String item = null;

		System.out.println("お金を入れてください");
		System.out.println("金額を入力してください");

		int money = 0;
		money = InputMoney.inputMoney();


		System.out.println("購入する商品番号を選択してください");
		System.out.println("１：コーラ");
		System.out.println("２：サイダー");
		System.out.println("３：コーヒー");

		Scanner sc = new Scanner(System.in);
		int itemNum = 0;
		try {
			itemNum = sc.nextInt();
		} catch(Exception e) {
			System.out.println("商品がありません");
			System.exit(1);
		} finally {
			sc.close();
		}

		switch(itemNum){
			case 1:
				item = "コーラ";
				break;
			case 2:
				item = "サイダー";
				break;
			case 3:
				item = "コーヒー";
				break;
		}

	System.out.println(item + "を選択しました");

		for(int i =0;i<=0;i += 0){

			sc = new Scanner(System.in);

			if(money >=120){
				System.out.println(item + "を購入しました");
				sc.close();
				i += 1;
			}else{
				System.out.println("金額が不足しています。");
				money += sc.nextInt();
				i += 0;

			}
		}
	}

}
