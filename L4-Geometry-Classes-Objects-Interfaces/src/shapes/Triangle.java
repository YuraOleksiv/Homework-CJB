package shapes;

import base.PlaneShape;
import base.Vertex;

import java.nio.DoubleBuffer;
import java.util.Arrays;

public class Triangle extends PlaneShape {
    public Triangle(Vertex vertex1, Vertex vertex2, Vertex vertex3) {
        super(vertex1, vertex2, vertex3);
    }

    @Override
    public Double getPerimeter() {
        Vertex vertex1 = getVertices()[0];
        Vertex vertex2 = getVertices()[1];
        Vertex vertex3 = getVertices()[2];

        Double distance12 = distanceBetweenVertices(vertex1, vertex2);
        Double distance13 = distanceBetweenVertices(vertex1, vertex3);
        Double distance23 = distanceBetweenVertices(vertex2, vertex3);

        return distance12 + distance13 + distance23;
    }

    private Double distanceBetweenVertices(Vertex vertex1, Vertex vertex2) {
        return Math.sqrt(Math.pow(vertex1.getX() - vertex2.getX(), 2) + Math.pow(vertex1.getY() - vertex2.getY(), 2));
    }

    @Override
    public Double getArea() {
        return 19.0; // TODO згадати формулу площі трикутника =)
    }

    @Override
    public String toString() {
        return "Triangle {" +
                "vertices=" + Arrays.toString(vertices) +
                ", Perimeter = " + getPerimeter() +
                ", Area = " + getArea() +
                '}';
    }
}
