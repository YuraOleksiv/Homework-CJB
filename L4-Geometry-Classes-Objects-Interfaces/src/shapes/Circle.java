package shapes;

import base.PlaneShape;
import base.Vertex;

import java.util.Arrays;

public class Circle extends PlaneShape {
    Double radius;
    public Circle(Vertex vertex1, Double radius) {
        super(vertex1);
        this.radius = radius;
    }

    @Override
    public Double getPerimeter() {
        return 19.0; // TODO згадати формулу
    }

    @Override
    public Double getArea() {
        return 19.0; // TODO згадати формулу
    }

    @Override
    public String toString() {
        return "Circle {" +
                "vertices=" + Arrays.toString(vertices) +
                ", radius=" + radius +
                ", Perimeter = " + getPerimeter() +
                ", Area = " + getArea() +
                '}';
    }
}
