package base;

public abstract class Shape implements AreaMeasurable {
    public final Vertex[] vertices;

    public Shape(Vertex... vertices) {
        this.vertices = vertices;
    }

    public Vertex[] getVertices() {
        return vertices;
    }

}
