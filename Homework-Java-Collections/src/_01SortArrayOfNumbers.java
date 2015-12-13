import java.util.Arrays;
import java.util.Scanner;

public class _01SortArrayOfNumbers {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = Integer.parseInt(scn.nextLine());		
		int[] numbers = new int[n];
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = scn.nextInt();
		}
		
		Arrays.sort(numbers);
		
		for (int i : numbers) {
			System.out.print(i + " ");
		}
	}

}
