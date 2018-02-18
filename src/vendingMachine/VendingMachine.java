package vendingMachine;

import beverage.Cider500ml;
import beverage.CocaCola500ml;
import beverage.Coffee190ml;
import beverage.Item;
import money.Coin;
import money.Money;
import money.Yen;

/**
 * @author TanigawaTetsuya
 *
 */
public class VendingMachine {
	/**
	 * 今入ってるお金
	 */
	private int amount = 0;
	/**
	 *
	 */
	private Item[][] itemArray = new Item[3][3];

	/**
	 * コンストラクタ
	 */
	public VendingMachine() {
		setItemArray();
	}

	/**
	 * 商品を初期化
	 */
	private void setItemArray() {
		for (int i = 0; i < itemArray.length; i++) {
			for (int j = 0; j < itemArray[i].length; j++) {
				if (i == 0) {
					itemArray[i][j] = new CocaCola500ml();
				} else if (i == 1) {
					itemArray[i][j] = new Cider500ml();
				} else if (i == 2) {
					itemArray[i][j] = new Coffee190ml();
				}
			}
		}
	}

	/**
	 * お金チェック
	 *
	 * @param money
	 */
	public void checkMoney(Money money) {
		// お金かチェック
		if (money instanceof Yen && money instanceof Coin) {
			this.amount += money.getAmount();
		}
		System.out.println("現在の金額 : ¥" + this.amount);
	}

	/**
	 * ドリンクを返却
	 *
	 * @return 買った飲み物
	 */
	public Item pushBottun(int i) {
		Item item = null;
		/*
		 *  選択した商品の在庫があればitemに格納し配列にnullを代入
		 */
		for (int j = 0; j < itemArray[i].length; j++) {
			if (itemArray[i][j] != null) {
				item = itemArray[i][j];
				if(item.getAmount() > this.amount) {
					// 金額が足りていない場合
					System.out.println("お金が足りません");
					return null;
				}
				itemArray[i][j] = null;
				break;
			}
		}
		if (item == null) {
			// 在庫がない場合nullを返却
			System.out.println("売り切れです");
			return null;
		}
		/*
		 *  在庫が０でないかつ金額が足りている場合
		 */
		System.out.println(item.getName() + "を購入しました");
		// 入金額から購入金額を引く
		this.amount -= item.getAmount();
		// リストからひとつ返却
		return item;
	}

	/**
	 * 買える商品を表示
	 */
	public void canBuyItemDisp() {
		StringBuilder msg = new StringBuilder();
		for (Item[] itemBuf : itemArray) {
			for (Item Item : itemBuf) {
				if(Item == null) {
					continue;
				}
				if (this.amount >= Item.getAmount()) {
					msg.append(Item.getName());
					break;
				}
			}
		}
		if("".equals(msg.toString())) {
			System.out.println("お金が足りません");
		} else {
			System.out.println(msg.toString() + "が買えます");
		}
	}
}
