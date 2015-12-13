import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _12CardsFrequencies {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);		
		String input = scn.nextLine();
		
		Pattern pattern = Pattern.compile("[^\\W]+");
		Matcher matcher = pattern.matcher(input);
		
		Map<String, Integer> cardsMap = new LinkedHashMap<>();
		int countCards = 0;
		
		while (matcher.find()) {
			String cardFace = matcher.group();
			countCards++;
			
			if (!cardsMap.containsKey(cardFace)) {
				cardsMap.put(cardFace, 1);
			} else {
				int oldValue = cardsMap.get(cardFace);
				cardsMap.put(cardFace, oldValue + 1);
			}
		}
		
		for (Entry<String, Integer> entry : cardsMap.entrySet()) {
			double frequency = (double)entry.getValue() / countCards * 100;
			System.out.printf("%s -> %.2f%% %n", entry.getKey(), frequency);
		}
	}

}
