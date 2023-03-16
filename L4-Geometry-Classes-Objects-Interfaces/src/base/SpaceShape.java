package base;

public abstract class SpaceShape extends Shape implements VolumeMeasurable {
    public SpaceShape(Vertex... vertices) {
        super(vertices);
    }

    public abstract Double getVolume();

}
