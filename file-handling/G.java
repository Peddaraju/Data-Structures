package app10101;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class G {
	public static void main(String[] args) throws Exception{
		System.out.println("enter path");
		File file = new File(new Scanner(System.in).next());
		FileReader fin = new FileReader(file);
		BufferedReader bin = new BufferedReader(fin);
		String s1, words[];
		int linesCount = 0, wordsCount = 0;
		Map<String, Integer> wordsOccurances = new HashMap<String, Integer>();
		while((s1 = bin.readLine()) != null) {
			linesCount ++;
			words = s1.split("[., ]+");
			wordsCount += words.length;
			for(String word : words) {
				if(wordsOccurances.get(word) != null) {
					wordsOccurances.put(word, wordsOccurances.get(word) + 1);
				}
				else {
					wordsOccurances.put(word, 1);
				}
			}
		}
		System.out.println("lines count:" + linesCount);
		System.out.println("words count:" + wordsCount);
		System.out.println("word occurances:" + wordsOccurances);
		Set<Entry<String, Integer>> entries = 
				new TreeSet<Map.Entry<String,Integer>>((c1, c2) -> c1.getValue().compareTo(c2.getValue()));
		entries.addAll(wordsOccurances.entrySet());
		System.out.println("word occurances in the sorting order:" + entries);
		List<Entry<String, Integer>> pairs = new ArrayList<Map.Entry<String,Integer>>(entries);
		System.out.println("Word which occurs maximum times:" + pairs.get(pairs.size() - 1));
		System.out.println("Word which occurs minimum times:" + pairs.get(0));
	}
}
