package com.gman.shape;

import com.gman.visitor.RenderEngine;

/**
 * Created by Anton Mikhaylov on 24.09.2018.
 */
public class Circle extends Dot {

    private int radius;

    public Circle(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void accept(RenderEngine v) {
        v.renderCircle(this);
    }
}
