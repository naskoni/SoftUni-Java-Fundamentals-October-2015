import java.util.Scanner;

public class _06CountSpecifiedWord {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);		
		String[] input = scn.nextLine().toLowerCase().split("\\W+");
		String target = scn.nextLine().toLowerCase();
		int wordsCount = 0;
		
		for (int i = 0; i < input.length; i++) {
			if (input[i].equals(target)) {
				wordsCount++;
			}
		}
		
		System.out.println(wordsCount);
	}

}
