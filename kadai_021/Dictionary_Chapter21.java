package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	//辞書用のハッシュマップを宣言
	HashMap<String, String> dictionary = new HashMap<String, String>();
	
	public Dictionary_Chapter21(){
		//ハッシュマップ変数dictionaryに、下記英単語のキーと意味を持つ値を追加する。
		dictionary.put("apple", "りんご");
	    dictionary.put("peach", "桃");
	    dictionary.put("banana", "バナナ");
	    dictionary.put("lemon", "レモン");
	    dictionary.put("pear", "梨");
	    dictionary.put("kiwi", "キウィ");
	    dictionary.put("strawberry", "いちご");
	    dictionary.put("grape", "ぶどう");
	    dictionary.put("muscat", "マスカット");
	    dictionary.put("cherry", "さくらんぼ");
	}
	
	public void checkWord(String word) {
	    if(dictionary.get(word) != null)
	    {
	    	System.out.println(word+"の意味は"+dictionary.get(word));
	    }else {
	    	System.out.println(word+"は辞書に存在しません");
	    }
	}
    
}
