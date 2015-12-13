import java.util.ArrayList;
import java.util.List;

import classes.Circle;
import classes.Cuboid;
import classes.PlaneShape;
import classes.Rectangle;
import classes.Shape;
import classes.SpaceShape;
import classes.Sphere;
import classes.SquarePyramid;
import classes.Triangle;
import classes.Vertex2D;
import classes.Vertex3D;

public class GeometryExamples {

	public static void main(String[] args) {
		List<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle(new Vertex2D(15, 15), new Vertex2D(30, 30), new Vertex2D(50, 25)));
        shapes.add(new Rectangle(new Vertex2D(18.25, 15.3), 18.9, 77.98));
        shapes.add(new Circle(new Vertex2D(16, 18), 3.33));
        shapes.add(new SquarePyramid(new Vertex3D(1, 2, 3), 1, 5));
        shapes.add(new Sphere(new Vertex3D(5, 8, 19.9), 18.2));
        shapes.add(new Cuboid(new Vertex3D(5, 8, 7), 3, 5, 8));

        System.out.println("All shapes:");
        shapes.stream()
                .forEach(System.out::println);
        System.out.println();

        System.out.printf("Only Space shapes with volume >= 40:%n");
        shapes.stream()
                .filter(shape -> shape instanceof SpaceShape)
                .map(shape1 -> (SpaceShape) shape1)
                .filter(spaceShape -> spaceShape.getVolume() >= 40d)
                .forEach(System.out::println);
        System.out.println();

        System.out.printf("Only Plain shapes ordered by perimeter asc:%n");
        shapes.stream()
                .filter(shape -> shape instanceof PlaneShape)
                .map(shape1 -> (PlaneShape) shape1)
                .sorted((shape1, shape2) -> Double.compare(shape1.getPerimeter(), shape2.getPerimeter()))
                .forEach(System.out::println);

	}

}
