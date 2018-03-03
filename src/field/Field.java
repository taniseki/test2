package field;
import java.util.ArrayList;
import java.util.List;

import human.Human;
import vendingMachine.VendingMachine;

public class Field {
	/**
	 * コントローラ対象自動販売機
	 */
	private VendingMachine vendingMachine = new VendingMachine();
	/**
	 * コントローラ対象人間
	 */
	private Human human = new Human();
	/**
	 * Controllerで召喚した自動販売機を格納するリスト
	 */
	private List<VendingMachine> vendingMachineList = new ArrayList<>();
	/**
	 * Controllerで召喚した人間を格納するリスト
	 */
	private List<Human> humanList = new ArrayList<>();

	/**
	 * @return vendingMachine
	 */
	public VendingMachine getVendingMachine() {
		return vendingMachine;
	}

	/**
	 * @param vendingMachine
	 *            セットする vendingMachine
	 */
	public void setVendingMachine(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}

	/**
	 * @return human
	 */
	public Human getHuman() {
		return human;
	}

	/**
	 * @param human
	 *            セットする human
	 */
	public void setHuman(Human human) {
		this.human = human;
	}

	/**
	 * @return vendingMachineList
	 */
	public List<VendingMachine> getVendingMachineList() {
		return vendingMachineList;
	}

	/**
	 * @param vendingMachineList
	 *            セットする vendingMachineList
	 */
	public void addVendingMachineList(VendingMachine vendingMachineList) {
		this.vendingMachineList.add(vendingMachineList);
	}

	/**
	 * @return humanList
	 */
	public List<Human> getHumanList() {
		return humanList;
	}

	/**
	 * @param humanList
	 *            セットする humanList
	 */
	public void addHumanList(Human human) {
		this.humanList.add(human);
	}
}
