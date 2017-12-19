package first;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 商品を選択するクラス
 * @author Seki
 *
 */
public class SelectItem {

	public static String selectItem(){
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String item = "";
		int itemNum = 0;

		try {
			itemNum = new Integer(in.readLine());
		} catch(Exception e) {
			System.out.println(Message.NO_ITEM);
			System.out.println(e);
			System.exit(1);
			return item;
		} finally {

		}

		switch(itemNum){
			case 1:
				item = Message.COLA;
				break;
			case 2:
				item = Message.CIDER;
				break;
			case 3:
				item = Message.CAFFEE;
				break;
		}
		return item;
	}

}
