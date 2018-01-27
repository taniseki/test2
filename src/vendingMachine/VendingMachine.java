package vendingMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import money.Money;

public class VendingMachine {

	/**
	 *
	 */
	public Money insertMoney() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));


		int a = 0;

		try {
			a = new Integer(in.readLine());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return InsertMoney.selectMoney(a);
	}
}
