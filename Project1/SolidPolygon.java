package Project1;

import java.awt.Color;
import java.awt.Graphics;

// Class that defines a solid polygon object
class SolidPolygon extends Polygon_ {
    public SolidPolygon(Color color, int vertexCount) {
        super(color, vertexCount);
    }

    @Override
    public void draw(Graphics graphics) {
        colorDrawing(graphics);
        graphics.fillPolygon(polygon);
    }
}
