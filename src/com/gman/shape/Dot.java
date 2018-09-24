package com.gman.shape;

import com.gman.visitor.RenderEngine;

/**
 * Created by Anton Mikhaylov on 24.09.2018.
 */
public class Dot implements Shape {

    protected int x;
    protected int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public void accept(RenderEngine v) {
        v.renderDot(this);
    }
}
