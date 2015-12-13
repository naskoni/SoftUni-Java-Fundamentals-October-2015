import java.util.Scanner;

public class _08OddAndEvenPairs {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);        

        System.out.println("Enter even number of integers, separated by a space:");
        String[] input = scn.nextLine().split(" ");
        
        if (input.length % 2 != 0) {
			System.out.println("Invalid length");
			return;
		}
        
        int[] numbers = new int[input.length];
        for (int i = 0; i < numbers.length; i++) {
			numbers[i] = Integer.parseInt(input[i]);
		}
        
        for (int i = 0; i < numbers.length; i += 2) {
			if (numbers[i] % 2 == 0 && numbers[i + 1] % 2 == 0) {
				System.out.printf("%d, %d -> both are even%n", numbers[i], numbers[i + 1]);  
			} else if (numbers[i] % 2 != 0 && numbers[i + 1] % 2 != 0) {
				System.out.printf("%d, %d -> both are odd%n", numbers[i], numbers[i + 1]);
			} else {
				System.out.printf("%d, %d -> different%n", numbers[i], numbers[i + 1]);
			}
		}
	}

}
