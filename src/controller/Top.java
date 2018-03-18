package controller;

/**
 * Topメニュークラス.<br>
 *
 * @author TanigawaTetsuya
 * @since 2018/3/3
 */
public class Top extends AbstractController {
	/** コントローラ説明文 */
	static public final String DESCRIPTION = "Topメニュー";
	/** 説明文１ */
	static public final String DESCRIPTION1 = "オブジェクトを生成する";
	/** 説明文２ */
	static public final String DESCRIPTION2 = "Test2";
	/** 説明文３ */
	static public final String DESCRIPTION3 = "Test3";
	/** 説明文４ */
	static public final String DESCRIPTION4 = "お金を入れる";

	public Top() {
		super(DESCRIPTION, DESCRIPTION1, DESCRIPTION2, DESCRIPTION3,DESCRIPTION4);
	}

	@Override
	protected void one() {
		Execution.exec(new Create());
	}

	@Override
	protected void two() {
		Execution.exec(new Test2());
	}

	@Override
	protected void three() {
		Execution.exec(new Test3());
	}

	//おつりを実装しようとしたけど、自販機メニューのなかだと思うので保留
	@Override
	protected void four() {
		Execution.exec(new InsertCoin());
	}
}
