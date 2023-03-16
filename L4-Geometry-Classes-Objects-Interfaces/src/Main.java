import base.Shape;
import base.Vertex;
import shapes.*;

public class Main {
    public static void main(String[] args) {

        Triangle triangle = new Triangle(new Vertex(1, 2), new Vertex(1, 0), new Vertex(-1, -1));
        Rectangle rectangle = new Rectangle(new Vertex(0, 0), 8.0, 4.0);
        Circle circle = new Circle(new Vertex(1, 1), 15.0);
        SquarePyramid squarePyramid = new SquarePyramid(new Vertex(2, 3), 10.0, 20.0);
        Cuboid cuboid = new Cuboid(new Vertex(1, 2), 25.0, 10.0, 7.0);
        Sphere sphere = new Sphere(new Vertex(0, 0), 15.0);

        System.out.println(triangle);
        System.out.println("---------------");
        System.out.println(rectangle);
        System.out.println("---------------");
        System.out.println(circle);
        System.out.println("---------------");
        System.out.println(squarePyramid);
        System.out.println("---------------");
        System.out.println(cuboid);
        System.out.println("---------------");
        System.out.println(sphere);

    }
}