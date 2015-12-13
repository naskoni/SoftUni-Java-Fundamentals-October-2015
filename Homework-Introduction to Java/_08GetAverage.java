import java.util.Scanner;

public class _08GetAverage {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);		
		System.out.print("Enter number a: ");
		double a = Double.parseDouble(scn.nextLine());
		System.out.print("Enter number b: ");
		double b = Double.parseDouble(scn.nextLine());
		System.out.print("Enter number c: ");
		double c = Double.parseDouble(scn.nextLine());
		
		double average = getAverage(a, b, c);
		
		System.out.printf("%.2f", average);
	}

	private static double getAverage(double a, double b, double c) {
		double average = (a + b + c) / 3;		
		return average;
	}

}
