package com.gman.visitor;

import com.gman.shape.Circle;
import com.gman.shape.Compound;
import com.gman.shape.Dot;
import com.gman.shape.Rectangle;
import com.gman.shape.Shape;

import java.util.List;

/**
 * Created by Anton Mikhaylov on 24.09.2018.
 */
public class SimpleRenderer implements RenderEngine {

    public void render(List<Shape> shapes) {
        shapes.forEach(s -> s.accept(this));
    }

    @Override
    public void renderDot(Dot d) {
        System.out.println("Rendered Dot with coordinates: " + d.getX() + " / " + d.getY());
    }

    @Override
    public void renderCircle(Circle c) {
        System.out.println("Rendered Circle with coordinates: " + c.getX() + " / " + c.getY() + " and radius: " + c.getRadius());
    }

    @Override
    public void renderRectangle(Rectangle r) {
        System.out.println("Rendered Rectangle with size: " + r.getLength() + " / " + r.getWidth());
    }

    @Override
    public void renderCompound(Compound c) {
        System.out.println("Rendered compound with shapes: " + c.getShapes());
    }
}
