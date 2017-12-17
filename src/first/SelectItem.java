package first;

import java.util.Scanner;

/**
 * 商品を選択するクラス
 * @author Seki
 *
 */
public class SelectItem {

<<<<<<< HEAD
	public static String selectItem(Scanner sc){
=======
	public static String selectItem(){
		System.out.println("aaaaaaaaa");
		Scanner sc = new Scanner(System.in);
		System.out.println(sc);
>>>>>>> branch 'master' of https://github.com/taniseki/test2.git
		String item = "";
		int itemNum = 0;
<<<<<<< HEAD

=======
		itemNum = sc.nextInt();
>>>>>>> branch 'master' of https://github.com/taniseki/test2.git
		try {
			System.out.println("ssss");
			itemNum = sc.nextInt();
		} catch(Exception e) {
			System.out.println("商品がありません");
			System.out.println(e);
			System.exit(1);
<<<<<<< HEAD
			return item;
=======

		} finally {
			sc.close();
>>>>>>> branch 'master' of https://github.com/taniseki/test2.git
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
