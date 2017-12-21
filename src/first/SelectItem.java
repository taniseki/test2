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

		System.out.println(Message.SELECT_ITEM);
		System.out.println(Message.COLA);
		System.out.println(Message.CIDER);
		System.out.println(Message.CAFFEE);

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String item = "";
		int itemNum = 0;

		try {
			itemNum = new Integer(in.readLine());
		} catch(Exception e) {
			System.out.println(Message.NO_ITEM);
			return item;
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
