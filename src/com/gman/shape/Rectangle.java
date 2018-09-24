package com.gman.shape;

import com.gman.visitor.RenderEngine;

/**
 * Created by Anton Mikhaylov on 24.09.2018.
 */
public class Rectangle implements Shape {

    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void accept(RenderEngine v) {
        v.renderRectangle(this);
    }
}
