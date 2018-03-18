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
	 * お金のインスタンスを受け取り、Buf箱に入れる
	 * @param money
	 */
	public void addMoney(Money money){
		for(int i = 0;i<changeBuf.length;i++){
			if(changeBuf[i] == null){
				changeBuf[i] = money;
				break;
			}
		}
	}

	/**
	 * 取引終了時におつりをおつり箱に移す。
	 * こちらからはBuf箱のみ返し、別クラスで割り振り処理
	 * @return changeBuf
	 */
	public Money[] insertChangeBuf(){

		return changeBuf;
	}

}
