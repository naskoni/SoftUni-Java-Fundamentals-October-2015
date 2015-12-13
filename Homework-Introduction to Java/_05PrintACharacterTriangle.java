import java.util.Scanner;

public class _05PrintACharacterTriangle {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		//min 2 to form triangle, max 26 - number of letters
		System.out.println("Enter integer from 2 to 26");
		int n = scn.nextInt();
		
		for (int i = 1; i <= n; i++) {
			char c = 'a';
			for (int j = 0; j < i; j++) {
				System.out.printf("%c ", c + j);
			}
			System.out.println();
		}
		
		for (int i = n - 1; i >= 0; i--) {
			char c = 'a';
			for (int j = 0; j < i; j++) {
				System.out.printf("%c ", c + j);
			}
			System.out.println();
		}

	}

}
