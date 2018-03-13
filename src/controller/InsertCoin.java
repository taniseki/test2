/**
 *
 */
package controller;

/**
 * おつり箱にお金を入れる(1)
 * @author masakazu seki
 *
 */
public class InsertCoin extends AbstractController {
	/** コントローラ説明文 */
	static public final String DESCRIPTION = "何を行いますか？";
	/** 説明文１ */
	static public final String DESCRIPTION1 = "1円を入れる";
	/** 説明文2 */
	static public final String DESCRIPTION2 = "5円を入れる";
	/** 説明文3 */
	static public final String DESCRIPTION3 = "10円を入れる";
	/** 説明文4 */
	static public final String DESCRIPTION4 = "50円を入れる";
	/** 説明文5 */
	static public final String DESCRIPTION5 = "おつりを貰う";
	/** 説明文6 */
	static public final String DESCRIPTION6 = "メニュー２へ";


	/**
	 * コンストラクタ
	 */
	InsertCoin(){
		super(DESCRIPTION,DESCRIPTION1,DESCRIPTION2,DESCRIPTION3,DESCRIPTION4
				,DESCRIPTION5);
	}


	protected void one(){

			}

}


