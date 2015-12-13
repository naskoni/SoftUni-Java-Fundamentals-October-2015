import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _09CombineListsOfLetters {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);	
		
		String[] firstInput = scn.nextLine().split(" ");		
		List<Character> firstList = new ArrayList<>();
		for (int i = 0; i < firstInput.length; i++) {
			firstList.add(firstInput[i].charAt(0));
		}
		
		String[] secondInput = scn.nextLine().split(" ");
		List<Character> secondList = new ArrayList<>();
		for (int i = 0; i < secondInput.length; i++) {
			secondList.add(secondInput[i].charAt(0));
		}
		
		List<Character> resultList = new ArrayList<>(firstList);
		for (Character c : secondList) {
			if (!firstList.contains(c)) {
				resultList.add(c);
			}
		}		
		
		for (Character c : resultList) {
			System.out.print(c + " ");
		}		
	}

}
