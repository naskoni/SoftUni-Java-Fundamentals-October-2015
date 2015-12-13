import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class _11MostFrequentWord {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);	
		List<String> words = new ArrayList<>(
				Arrays.asList(scn.nextLine().toLowerCase().split("\\W+")));
		
		Map<String, Integer> wordsMap = new TreeMap<>();
		
		for (String s : words) {
			if (!wordsMap.containsKey(s)) {
				wordsMap.put(s, 1);
			} else {
				int oldValue = wordsMap.get(s);
				wordsMap.put(s, oldValue + 1);
			}
		}		
		
		int maxValue = wordsMap.values()
				.stream()
				.max(Integer::compare)
				.get();
		
		for (Entry<String, Integer> entry : wordsMap.entrySet()) {
			if (entry.getValue() == maxValue) {
				System.out.printf("%s -> %d times%n", entry.getKey(), entry.getValue());
			}
		}
	}

}
