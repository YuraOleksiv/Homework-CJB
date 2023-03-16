package shapes;

import base.PlaneShape;
import base.Vertex;

import java.util.Arrays;

public class Rectangle extends PlaneShape {
    Double width;
    Double height;

    public Rectangle(Vertex vertex1, Double width, Double height) {
        super(vertex1);
        this.width = width;
        this.height = height;
    }

    @Override
    public Double getPerimeter() {
        return (width + height) * 2;

    }

    @Override
    public Double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "vertices=" + Arrays.toString(vertices) +
                ", width = " + width +
                ", height = " + height +
                ", Perimeter = " + getPerimeter() +
                ", Area = " + getArea() +
                '}';
    }
}
