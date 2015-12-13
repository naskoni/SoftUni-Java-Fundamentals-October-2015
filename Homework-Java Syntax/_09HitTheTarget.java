import java.util.Scanner;

public class _09HitTheTarget {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);        

        System.out.println("Enter an integer N: ");
        int n = scn.nextInt();
        
        for (int i = 1; i <= 20; i++) {
			for (int j = 1; j <= 20; j++) {
				if (i + j == n) {
					System.out.printf("%d + %d = %d%n", i, j, n);
				}
				if (i - j == n) {
					System.out.printf("%d - %d = %d%n", i, j, n);
				}
			}
		}

	}

}
