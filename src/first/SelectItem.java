package first;

import java.util.Scanner;

/**
 * 商品を選択するクラス
 * @author Seki
 *
 */
public class SelectItem {

	public static String selectItem(){
		System.out.println("aaaaaaaaa");
		Scanner sc = new Scanner(System.in);
		System.out.println("aaaaaaaaa");
		String item = null;
		int itemNum = 0;
		try {
			itemNum = sc.nextInt();
		} catch(Exception e) {
			System.out.println("商品がありません");
			System.out.println(e);
			System.exit(1);
			return item;
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
		return item;
	}

}
