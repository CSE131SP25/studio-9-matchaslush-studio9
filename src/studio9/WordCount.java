package studio9;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import support.cse131.NotYetImplementedException;

public class WordCount {
	/**
	 * Constructs and returns a map of the distinct words in the specified list with
	 * each word associated with its accumulated count (that is: the number of
	 * occurrences of the word in the list).
	 * 
	 * For example, if passed a List<String> containing:
	 * 
	 * [to, be, or, not, to, be]
	 * 
	 * the resulting Map<String, Integer> would contain
	 * 
	 * key="to", value=2;
	 * key="be", value=2;
	 * key="or", value=1;
	 * key="not", value=1;
	 * 
	 * @param words
	 * @return a map which contains all of the distinct words as keys, each
	 *         associated with the number of occurrences of the word
	 */
	public static Map<String, Integer> countWords(List<String> words) {
		 Map<String, Integer> wordCounts = new HashMap<>();

		    for (String word : words) {
		        if (wordCounts.containsKey(word)) {
		            wordCounts.put(word, wordCounts.get(word) + 1);
		        } else {
		            wordCounts.put(word, 1);
		        }
		    }

		    return wordCounts;

	}
	
	public static void main(String[] args) {
	   List<String> wordList = new LinkedList<>();
	    wordList.add("to");
	    wordList.add("be");
	    wordList.add("or");
	    wordList.add("not");
	    wordList.add("to");
	    wordList.add("be");

	    Map<String, Integer> words = countWords(wordList);

	    for (Map.Entry<String, Integer> entry : words.entrySet()) {
	        System.out.println("key=\"" + entry.getKey() + "\", value=" + entry.getValue());
	    }

		
		//TODO: Write code that will iterate over the words map
		//to verify its contents
	}
}
