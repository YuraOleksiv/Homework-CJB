package base;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable {
    public PlaneShape(Vertex... vertices) {
        super(vertices);
    }


    public abstract Double getPerimeter();
}