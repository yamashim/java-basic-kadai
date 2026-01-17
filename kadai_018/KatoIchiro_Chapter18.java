package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

	//名を表すフィールドの値（親クラスの値）をセットする
	public void setGivenName() {
		super.givenName = "一郎";
	}
	
	//個別の紹介を出力する（親クラスの抽象クラス）
	public void eachIntroduce() {
		System.out.println("好きな食べ物はリンゴです");
	}

}
