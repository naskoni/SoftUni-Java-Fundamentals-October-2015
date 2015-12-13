import java.util.Scanner;

public class _05CountAllWords {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);		
		String[] input = scn.nextLine().split("\\W+");
		
		System.out.println(input.length);
	}

}
