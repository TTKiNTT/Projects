package Project1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

// Class that defines a parallelogram object
class Parallelogram extends Image {
    public Point upperLeft;
    public Point lowerRight;
    public int xOffset;

    public Parallelogram(Color color, Point upperLeft, Point lowerRight, int xOffset) {
        super(color);
        this.upperLeft = upperLeft;
        this.lowerRight = lowerRight;
        this.xOffset = xOffset;

        // Allocate arrays for x and y coordinates
        xCoordinates = new int[4];
        yCoordinates = new int[4];

        // Compute the coordinates of the parallelogram
        xCoordinates[0] = upperLeft.x;
        yCoordinates[0] = upperLeft.y;
        xCoordinates[1] = lowerRight.x;
        yCoordinates[1] = upperLeft.y;
        xCoordinates[2] = lowerRight.x - xOffset;
        yCoordinates[2] = lowerRight.y;
        xCoordinates[3] = upperLeft.x - xOffset;
        yCoordinates[3] = lowerRight.y;
    }

    @Override
    public void draw(Graphics graphics) {
        colorDrawing(graphics);
        graphics.drawPolygon(xCoordinates, yCoordinates, 4);
    }
}