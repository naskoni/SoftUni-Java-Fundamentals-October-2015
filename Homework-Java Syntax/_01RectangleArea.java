import java.util.Scanner;

public class _01RectangleArea {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the sides of the rectangle, separated by a space: ");
		int a = scn.nextInt();
		int b = scn.nextInt();
		
		int area = a * b;
		
		System.out.println("The area of the rectangle is: " + area);
		
	}

}
