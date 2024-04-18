package Project1;

// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// August 2021

import java.awt.*;

// Base class for all polygon classes
class Polygon_ extends Image {
    private int vertexCount;
    protected Polygon polygon;

    public Polygon_(Color color, int vertexCount) {
        super(color);
        this.vertexCount = vertexCount;
    }

    public void createPolygon(int[] xPoints, int[] yPoints) {
        polygon = new Polygon(xPoints, yPoints, vertexCount);
    }

    @Override
    public void draw(Graphics graphics) {
        colorDrawing(graphics);
        graphics.drawPolygon(polygon);
    }
}
