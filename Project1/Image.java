package Project1;

// CMSC 330 Advanced Programming Languages
// Project 1 Skeleton
// UMGC CITE
// August 2021

import java.awt.*;

// Base class for all graphic images
abstract class Image {
    protected Color color;
    protected int[] xCoordinates;
    protected int[] yCoordinates;

    public Image(Color color) {
        this.color = color;
    }

    // Abstract method to draw the image
    public abstract void draw(Graphics graphics);

    // Helper method to set the color for drawing
    protected void colorDrawing(Graphics graphics) {
        graphics.setColor(color);
    }
}


