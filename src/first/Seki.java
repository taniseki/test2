package first;

import java.util.Scanner;

public class Seki {

	public static void main(String[] args) {

		//購入商品
		String item = null;

		System.out.println("お金を入れてください");
		System.out.println("金額を入力してください");
		Scanner sc = new Scanner(System.in);

		int money = sc.nextInt();
		int itemComprete = 0;


		System.out.println(money);

		System.out.println("購入する商品番号を選択してください");
		System.out.println("１：コーラ");
		System.out.println("２：サイダー");
		System.out.println("３：コーヒー");

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


		for(int i =0;;i=1){
			sc = new Scanner(System.in);

			if(money >=120){
				System.out.println(item + "を購入しました");
				itemComprete = 1;
				sc.close();
			}else{
				System.out.println("金額が不足しています。");
				money += sc.nextInt();
				itemComprete += 0;

			}
		}




	}

}
