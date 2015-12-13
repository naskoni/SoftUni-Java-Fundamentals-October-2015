import java.util.Scanner;

public class _16CalculateNFactorial {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = Integer.parseInt(scn.nextLine());
		
		long factorial = calcFactorial(n);
		System.out.println(factorial);
	}

	private static long calcFactorial(int n) {		
		if (n == 1 || n == 0) {
			return 1;
		} 
		
		return n * calcFactorial(n - 1);		
	}

}
