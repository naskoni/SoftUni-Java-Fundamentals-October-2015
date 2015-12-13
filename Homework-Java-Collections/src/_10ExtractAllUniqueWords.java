import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _10ExtractAllUniqueWords {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);		
		List<String> words = new ArrayList<>(
				Arrays.asList(scn.nextLine().toLowerCase().split("\\W+")));
		
		Set<String> uniqueWords = new TreeSet<>(words);
		
		uniqueWords.forEach(s -> System.out.print(s + " "));	
	}

}
