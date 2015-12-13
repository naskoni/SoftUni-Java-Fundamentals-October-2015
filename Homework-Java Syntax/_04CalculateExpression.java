import java.util.Locale;
import java.util.Scanner;

public class _04CalculateExpression {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
        scn.useLocale(Locale.ENGLISH);

        System.out.println("Enter a floating-point a: ");
        double a = scn.nextDouble();
        System.out.println("Enter a floating-point b: ");
        double b = scn.nextDouble();
        System.out.println("Enter a floating-point c: ");
        double c = scn.nextDouble();      
        
        double firstFormulaResult = calcFirstFormula(a, b, c);
        System.out.printf("F1 result: %.2f%n", firstFormulaResult);
        
        double secondFormulaResult = calcSecondFormula(a, b, c);
        System.out.printf("F2 result: %.2f%n", secondFormulaResult);
        
        double diff = calcDifference(a, b, c, firstFormulaResult, secondFormulaResult);
        System.out.printf("Diff: %.2f%n", diff);

	}

	private static double calcDifference(double a, double b, double c,
			double firstFormulaResult, double secondFormulaResult) {
		double diff = ((a + b + c) / 3) - ((firstFormulaResult + secondFormulaResult) / 2);		
		return Math.abs(diff);
	}

	private static double calcSecondFormula(double a, double b, double c) {
		double result = Math.pow((a * a + b * b - c * c * c), a - b);
		return result;
	}

	private static double calcFirstFormula(double a, double b, double c) {		
		double result = Math.pow((a * a + b * b) / (a * a - b * b),
				(a + b + c) / Math.sqrt(c));
		return result;
	}

}
