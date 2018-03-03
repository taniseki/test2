package controller;

public class Test3 extends AbstractController {

	Test3() {
		super("", "", "three");
	}

	protected void three() {
		System.out.println("three");
	}
}
