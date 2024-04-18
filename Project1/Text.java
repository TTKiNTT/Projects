package Project1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

// Class that defines a text object
class Text extends Image {
    private Point location;
    private String text;

    public Text(Color color, Point location, String text) {
        super(color);
        this.location = location;
        this.text = text;
    }

    @Override
    public void draw(Graphics graphics) {
        colorDrawing(graphics);
        graphics.drawString(text, location.x, location.y);
    }
}
