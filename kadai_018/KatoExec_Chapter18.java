package kadai_018;

public class KatoExec_Chapter18 {

	public static void main(String[] args) {
		//子クラスのインスタンスを作成
		KatoTaro_Chapter18   taro   = new KatoTaro_Chapter18();
		KatoIchiro_Chapter18 ichiro = new KatoIchiro_Chapter18();
		KatoHanako_Chapter18 hanako = new KatoHanako_Chapter18();

		//setGivenNameメソッドを実行する
		taro.setGivenName();
		ichiro.setGivenName();
		hanako.setGivenName();
		
		
		
		//execIntroduceメソッドを実行する
		taro.execIntroduces();
		//以下は出力結果の参考イメージと合わせるために実行する
		//commonIntroduceメソッドを実行する
		taro.commonIntroduce();
		//eachIntroduceメソッドを実行する
		taro.eachIntroduce();
		
		
		
		ichiro.execIntroduces();
		ichiro.commonIntroduce();
		ichiro.eachIntroduce();
		
		hanako.execIntroduces();
		hanako.commonIntroduce();
		hanako.eachIntroduce();
		
		
	}

}
