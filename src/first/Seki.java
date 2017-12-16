package first;

import java.util.Scanner;

public class Seki {

	public static void main(String[] args) {

		//購入商品
		String item = null;

		System.out.println("お金を入れてください");
		System.out.println("金額を入力してください");
		Scanner sc = new Scanner(System.in);

		int money = 0;
		try {
			money = sc.nextInt();
		} catch (Exception e) {
			System.out.println("数字を入力してください");
			sc.close();
			System.exit(1);
		}
		if(money / 10 != 0){
			System.out.println("認識できないお金です");
		}else{
			money += money;
		}
		System.out.println(money);

		System.out.println("購入する商品番号を選択してください");
		System.out.println("１：コーラ");
		System.out.println("２：サイダー");
		System.out.println("３：コーヒー");

		sc = new Scanner(System.in);
		int itemNum = sc.nextInt();
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
