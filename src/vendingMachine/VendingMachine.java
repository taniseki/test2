package vendingMachine;

import beverage.Cider500ml;
import beverage.CocaCola500ml;
import beverage.Coffee190ml;
import beverage.Item;
import money.Bill;
import money.Coin;
import money.Money;
import money.Yen;

/**
 * @author TanigawaTetsuya
 *
 */
public class VendingMachine {
	/**
	 * 入金額
	 */
	private int amount = 0;
	/**
	 * 入っている商品配列
	 */
	private Item[][] items = new Item[3][3];

	/**
	 * コンストラクタ
	 */
	public VendingMachine() {
		setItems();
	}

	/**
	 * 商品を初期化
	 */
	private void setItems() {
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items[i].length; j++) {
				if (i == 0) {
					items[i][j] = new CocaCola500ml();
				} else if (i == 1) {
					items[i][j] = new Cider500ml();
				} else if (i == 2) {
					items[i][j] = new Coffee190ml();
				}
			}
		}
	}

	/**
	 * 硬貨チェック
	 *
	 * @param money
	 */
	public void checkCoinMoney(Money money) {
		// nullであるかチェック
		if (money == null) {
			return;
		}
		// Coinであるかチェック
		if (!(money instanceof Coin)) {
			System.out.println("入りません");
			return;
		}
		// Yenであるかチェック
		if (!(money instanceof Yen)) {
			System.out.println("その硬貨は使えません");
			return;
		}
		// 1円または5円でないかチェック
		if (money.getAmount() == 1 || money.getAmount() == 5) {
			System.out.println("1円と5円は使えません");
			return;
		}
		// 全てのチェックが通ればamountに追加
		this.amount += money.getAmount();
		System.out.println("現在の金額 : ¥" + this.amount);
	}

	/**
	 * お札チェック
	 *
	 * @param money
	 */
	public void checkBillMoney(Money money) {
		// Billであるかチェック
		if (!(money instanceof Bill)) {
			System.out.println("入りません");
			return;
		}
		// Yenであるかチェック
		if (!(money instanceof Yen)) {
			System.out.println("その紙幣は使えません");
			return;
		}
		// 1000円札であるかチェック
		if (money.getAmount() != 1000) {
			System.out.println("1000円札以外は使えません");
			return;
		}
		// 全てのチェックが通ればamountに追加
		this.amount += money.getAmount();
		System.out.println("入金額 : ¥" + this.amount);
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
		for (int j = 0; j < items[i].length; j++) {
			if (items[i][j] != null) {
				// 在庫があればitemに代入し金額が足りていれば商品を削除
				item = items[i][j];
				if(item.getAmount() > this.amount) {
					// 金額が足りていない場合nullを返却
					System.out.println("お金が足りません");
					return null;
				}
				items[i][j] = null;
				break;
			}
		}
		if (item == null) {
			// 在庫がない場合nullを返却
			System.out.println("売り切れです");
			return null;
		}
		/*
		 *  在庫が0でないかつ金額が足りている場合
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
		for (Item[] itemBuf : items) {
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
			// 今の入金額で買える商品がない場合
			System.out.println("お金が足りません");
		} else {
			// 買える商品を表示
			System.out.println(msg.toString() + "が買えます");
		}
	}
}
