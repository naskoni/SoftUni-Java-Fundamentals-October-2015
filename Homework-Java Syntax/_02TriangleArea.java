import java.awt.Point;
import java.util.Scanner;

public class _02TriangleArea {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter X and Y coordinates of point A, separated by a space: ");
		Point pointA = new Point(scn.nextInt(), scn.nextInt());
		
		System.out.println("Enter X and Y coordinates of point B, separated by a space: ");
		Point pointB = new Point(scn.nextInt(), scn.nextInt());
		
		System.out.println("Enter X and Y coordinates of point C, separated by a space: ");
		Point pointC = new Point(scn.nextInt(), scn.nextInt());
		
		double area = calcArea(pointA, pointB, pointC);
		int roundedArea = (int) Math.round(area);
		System.out.println("The area is: " + roundedArea);
	}

	private static double calcArea(Point pointA, Point pointB, Point pointC) {
		double area = (pointA.getX() * (pointB.getY() - pointC.getY()) 
				+ pointB.getX() * (pointC.getY() - pointA.getY()) 
				+ pointC.getX() * (pointA.getY() - pointB.getY()))
				/ 2;
		if (area < 0.0) {
			area = Math.abs(area);
		}
		return area;
	}

}
