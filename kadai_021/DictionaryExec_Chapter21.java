package kadai_021;

public class DictionaryExec_Chapter21 {
	public static void main(String[] args) {
		//辞書クラスのインスタンスを宣言
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		
		//辞書で調べたい英単語のリストを宣言
	    String[] englishArray = {"apple", "banana", "grape", "orange"};
	    
	    //調べたい英単語リストを辞書で調べる
	    for(String englishWord : englishArray) {
	    	dictionary.checkWord(englishWord);
	    }
	}
}
