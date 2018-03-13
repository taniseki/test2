package controller;

public class InsertCoin_2 extends AbstractController {
	/** コントローラ説明文 */
	static public final String DESCRIPTION = "何を行いますか？";
		/** 説明文1 */
	static public final String DESCRIPTION1 = "100円を入れる";
	/** 説明文2 */
	static public final String DESCRIPTION2 = "500円を入れる";
	/** 説明文3 */
	static public final String DESCRIPTION3 = "おつりを貰う";
	/** 説明文4 */
	static public final String DESCRIPTION4 = "メニュー１へ";

	/**
	 * コンストラクタ
	 */
	InsertCoin_2(){
		super(DESCRIPTION,DESCRIPTION1,DESCRIPTION2,DESCRIPTION3);
	}
}
