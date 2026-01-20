package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		//じゃんけんクラスのインスタンスを生成
		Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();
		
		//自分のじゃんけんの手を入力する
		String myHand = jyanken.getMyChoice();
		
		//対戦相手のじゃんけんの手をランダムに選ぶ
		String enemyHand = jyanken.getRandom();
		
		//じゃんけんの結果を出力する
		jyanken.playGame(myHand, enemyHand);
		
	}

}
