package shapes;

import base.SpaceShape;
import base.Vertex;

import java.util.Arrays;

public class Sphere extends SpaceShape {
    Double radius;
    public Sphere(Vertex vertex1, Double radius) {
        super(vertex1);
        this.radius = radius;
    }

    @Override
    public Double getVolume() {
        return 19.0; // TODO згадати формулу
    }

    @Override
    public Double getArea() {
        return 19.0; // TODO згадати формулу
    }

    @Override
    public String toString() {
        return "Sphere {" +
                "vertices=" + Arrays.toString(vertices) +
                ", radius=" + radius +
                ", Volume = " + getVolume() +
                ", Area = " + getArea() +
                '}';
    }
}
