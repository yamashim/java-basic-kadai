package kadai_028;
import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
	//自分のじゃんけんの手を入力する
	public String getMyChoice() {
		System.out.println("じゃんけんを行います。自分の手を入力してください。\nグー：r チョキ：s パー：p");
		
		//キーボード入力
		Scanner scanner = new Scanner(System.in);
		
		
		//じゃんけんの手を入力する。
		//ただし、正しい手を入力するまで繰り返す。
		do{	
			
			//入力した内容を取得する
			String input= scanner.nextLine();
			
			//じゃんけんの入力を判定する
			switch(input){
				//値が正しく入力されている場合
				case "r","s","p" -> {
					//Scannerクラスのオブジェクトをクローズする
					scanner.close();
					
					return input;
				}
				//それ以外の値が入力された場合
				default 		 -> {
					System.out.println("正しいじゃんけんの手を入力してください。\nグー：r チョキ：s パー：p");
				}
			}
		}while(true);
	}
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		//じゃんけんの配列を表示する
		String[] jyankenPatterns = {"r","s","p"};
		
		//0から2までの整数をランダムに生成
		int randomIndex = (int) Math.floor(Math.random()*3);
		
		return jyankenPatterns[randomIndex];
	}
	
	//じゃんけんを行う
	public void playGame(String myHand, String enemyHand) {
		//自分と対戦相手のじゃんけんの手を比較する
		HashMap<String,String> jyankenMap = new HashMap<String,String>();
		jyankenMap.put("r", "グー");
		jyankenMap.put("s", "チョキ");
		jyankenMap.put("p", "パー");
		
		//自分と対戦相手のじゃんけんの手を出力する
		System.out.println("あなたの手は"+jyankenMap.get(myHand)+"です");
		System.out.println("対戦相手の手は"+jyankenMap.get(enemyHand)+"です");
		
		//じゃんけんの結果を判定して出力する
		if (myHand.equals(enemyHand)) {
			System.out.println("あいこです");
		}else if ((myHand+enemyHand).equals("rs") || (myHand+enemyHand).equals("sp")|| (myHand+enemyHand).equals("pr")) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
		
		/*switch(myHand+enemyHand) {
			case "rr","ss","pp" -> System.out.println("あいこです");
			case "rs","sp","pr" -> System.out.println("自分の勝ちです");
			case "rp","sr","ps" -> System.out.println("自分の負けです");
			default -> System.out.println("例外です"+myHand+enemyHand);
		}*/
		
	}
	
}
