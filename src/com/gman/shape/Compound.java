package com.gman.shape;

import com.gman.visitor.RenderEngine;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Anton Mikhaylov on 24.09.2018.
 */
public class Compound implements Shape {

    List<Shape> shapes = new ArrayList<>();

    public Compound(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    @Override
    public void accept(RenderEngine v) {
        v.renderCompound(this);
    }
}
