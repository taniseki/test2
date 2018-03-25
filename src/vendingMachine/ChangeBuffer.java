/**
 *
 */
package vendingMachine;

import money.Money;

/**
 * その時の取引で、入れられたお金を所持するクラス。
 * 取引終了時に、お金に対応するおつり箱にお金を入れるかおつりを返す
 * 配列としてお金を所持する
 * @author masakazu seki
 *
 */
public class ChangeBuffer {

	/**
	 * 一取引のおつりを所持
	 */
	private Money[] changeBuf = new Money[100];
	/**
	 * Buff内の金額の合計
	 */
	private int bufAmount;

	/**
	 * お金のインスタンスを受け取り、Buf箱に入れる
	 * @param money
	 */
	public void addMoney(Money money){
		for(int i = 0;i<changeBuf.length;i++){
			if(changeBuf[i] == null){
				changeBuf[i] = money;
				this.bufAmount += money.getAmount();
				break;
			}
		}
	}

	/**
	 * 現在のbuff内の金額を返す
	 */
	public int getBufAmount(){
		return this.bufAmount;
	}
	/**
	 * 一時変数tmpMoneyに中身をコピーして、changeBufの中身を消去する。
	 * こちらからはBuf箱のみ返し、別クラスで割り振り処理
	 * @return changeBuf
	 */
	public Money[] returnChangeBuf(){

		//一時変数tmpMoneyに中身をコピー
		Money[] tmpMoney = new Money[100];
		for(int i = 0; i<changeBuf.length;i++){
			tmpMoney[i] = changeBuf[i];
		}

		/*
		 * Buff箱の中身を消去
		 */
		for(int i =0;i<changeBuf.length;i++){
			changeBuf[i] = null;
		}
		return tmpMoney;
	}

}
