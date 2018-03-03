package controller;

public class Test2 extends AbstractController{

	Test2() {
		super("", "two");
	}

	@Override
	protected void two() {
		System.out.println("two");
	}
}
