/**
 *
 */
package vendingMachine;

import money.FiftyYen;
import money.Money;
import money.TenYen;

/**
 * Buf箱から送られた配列の中身に対して、10円～2000円までをおつり箱に割り振る処理
 * この処理は自販機クラスに書いたほうがいい？？？
 * @author masakazu seki
 *
 */
public class ChangeAllocation {

	public void Allocation(Money[] changeBuf){

		for(int i = 0;i<changeBuf.length;i++){
			if (changeBuf[i] instanceof TenYen){

			}
			if (changeBuf[i] instanceof FiftyYen){

			}

		}
	}
}
