package first;

import java.util.Scanner;

public class TanigawaTest {

	public static void main(String[] args) {
		System.out.println("お金おいれてください");
		System.out.println("何円いれますか？");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		System.out.println(money + "円いれました");
		scanner.close();

	}

}
