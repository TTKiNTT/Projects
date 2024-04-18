package Project1;

// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// August 2021

import java.awt.*;

// Class that defines a hollow right triangle object
class RightTriangle extends Polygon_ {
    public RightTriangle(Color color, Point upperLeft, int height, int width) {
        super(color, 3);
        int[] xPoints = { upperLeft.x, upperLeft.x, upperLeft.x + width };
        int[] yPoints = { upperLeft.y, upperLeft.y + height, upperLeft.y + height };
        createPolygon(xPoints, yPoints);
    }
}