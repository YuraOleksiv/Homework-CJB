package shapes;

import base.SpaceShape;
import base.Vertex;

import java.util.Arrays;

public class SquarePyramid extends SpaceShape {
    Double baseWidth;
    Double pyramidHeight;

    public SquarePyramid(Vertex vertexBaseCenter, Double baseWidth, Double pyramidHeight) {
        super(vertexBaseCenter);
        this.baseWidth = baseWidth;
        this.pyramidHeight = pyramidHeight;
    }

    @Override
    public Double getArea() {
        return 19.0; // TODO згадати формулу
    }

    @Override
    public Double getVolume() {
        return 19.0; // TODO згадати формулу
    }

    @Override
    public String toString() {
        return "SquarePyramid {" +
                "vertices=" + Arrays.toString(vertices) +
                ", baseWidth=" + baseWidth +
                ", pyramidHeight=" + pyramidHeight +
                ", Volume = " + getVolume() +
                ", Area = " + getArea() +
                '}';
    }
}
