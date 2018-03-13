/**
 *
 */
package controller;

/**
 * おつり箱におつりを入れる（２）
 * @author masakazu seki
 *
 */
public class InsertBill extends AbstractController{
	/** コントローラ説明文 */
	static public final String DESCRIPTION = "何を行いますか？";
	/** 説明文1 */
	static public final String DESCRIPTION1 = "1000円を入れる";
	/** 説明文2 */
	static public final String DESCRIPTION2 = "5000円を入れる";
	/** 説明文3 */
	static public final String DESCRIPTION3 = "10000円を入れる";
	/** 説明文4 */
	static public final String DESCRIPTION4 = "2000円を入れる";
	/** 説明文5 */
	static public final String DESCRIPTION5 = "おつりを貰う";

	/**
	 * コンストラクタ
	 */
	InsertBill(){
		super(DESCRIPTION,DESCRIPTION1,DESCRIPTION2,DESCRIPTION3,DESCRIPTION4
				,DESCRIPTION5);
	}
}
