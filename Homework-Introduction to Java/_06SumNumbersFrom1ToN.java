import java.util.Scanner;

public class _06SumNumbersFrom1ToN {
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);		
		System.out.println("Enter positive integer:");
		int n = scn.nextInt();
		int sum = 0;
		
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		
		System.out.printf("The sum of all numbers from 1 to %d is: %d", n, sum);
	}
}
