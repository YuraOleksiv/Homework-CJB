package shapes;

import base.SpaceShape;
import base.Vertex;

import java.util.Arrays;

public class Cuboid extends SpaceShape {
    Double width;
    Double height;
    Double depth;

    public Cuboid(Vertex vertex1, Double width, Double height, Double depth) {
        super(vertex1);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public Double getVolume() {
        return width * height * depth;

    }

    @Override
    public Double getArea() {
        return (2 * width * height) + (2 * height * depth) + (2 * depth * width);
    }

    @Override
    public String toString() {
        return "Cuboid {" +
                "vertices=" + Arrays.toString(vertices) +
                ", width = " + width +
                ", height = " + height +
                ", depth" + depth +
                ", Volume = " + getVolume() +
                ", Area = " + getArea() +
                '}';
    }
}
