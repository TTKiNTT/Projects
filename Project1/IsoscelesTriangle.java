package Project1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

// Class that defines an isosceles triangle object
class IsoscelesTriangle extends Image {
    public Point topVertex;
    public int height;
    public int width;

    public IsoscelesTriangle(Color color, Point topVertex, int height, int width) {
        super(color);
        this.topVertex = topVertex;
        this.height = height;
        this.width = width;

        // Allocate arrays for x and y coordinates
        xCoordinates = new int[3];
        yCoordinates = new int[3];

        // Compute the coordinates of the triangle
        xCoordinates[0] = topVertex.x;
        yCoordinates[0] = topVertex.y;
        xCoordinates[1] = topVertex.x - (width / 2);
        yCoordinates[1] = topVertex.y + height;
        xCoordinates[2] = topVertex.x + (width / 2);
        yCoordinates[2] = topVertex.y + height;
    }

    @Override
    public void draw(Graphics graphics) {
        colorDrawing(graphics);
        graphics.drawPolygon(xCoordinates, yCoordinates, 3);
    }
}
