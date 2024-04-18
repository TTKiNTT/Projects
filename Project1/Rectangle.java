package Project1;

// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// August 2021

import java.awt.*;

// Class that defines a hollow rectangle object
class Rectangle extends Polygon_ {
    public Rectangle(Color color, Point upperLeft, int height, int width) {
        super(color, 4);
        int[] xPoints = { upperLeft.x, upperLeft.x + width, upperLeft.x + width, upperLeft.x };
        int[] yPoints = { upperLeft.y, upperLeft.y, upperLeft.y + height, upperLeft.y + height };
        createPolygon(xPoints, yPoints);
    }
}