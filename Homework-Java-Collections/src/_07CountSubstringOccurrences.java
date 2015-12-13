import java.util.Scanner;

public class _07CountSubstringOccurrences {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);		
		String[] input = scn.nextLine().toLowerCase().split("\\W+");
		String target = scn.nextLine().toLowerCase();
		int substringCount = 0;
		String currentWord = "";
		
		for (int i = 0; i < input.length; i++) {
			currentWord = input[i];
			
			for (int j = 0; j <= currentWord.length() - target.length(); j++) {
				String currentSubstring = currentWord.substring(j, target.length() + j);
				
				if (currentSubstring.equals(target)) {
					substringCount++;
				}
			}				
		}
		
		System.out.println(substringCount);
	}

}
