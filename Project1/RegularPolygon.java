package Project1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

// Class that defines a regular polygon object
class RegularPolygon extends Image {
    public Point center;
    public int sides;
    public int radius;

    public RegularPolygon(Color color, Point center, int sides, int radius) {
        super(color);
        this.center = center;        
        this.sides = sides;
        this.radius = radius;

        // Allocate arrays for x and y coordinates
        xCoordinates = new int[sides];
        yCoordinates = new int[sides];

        // Compute the coordinates of the regular polygon
        double angle = 2 * Math.PI / sides;
        for (int i = 0; i < sides; i++) {
            xCoordinates[i] = (int) (center.x + radius * Math.cos(i * angle));
            yCoordinates[i] = (int) (center.y + radius * Math.sin(i * angle));
        }
    }

    @Override
    public void draw(Graphics graphics) {
        colorDrawing(graphics);
        graphics.drawPolygon(xCoordinates, yCoordinates, sides);
    }
}
