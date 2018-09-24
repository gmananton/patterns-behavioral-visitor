package com.gman;

import com.gman.shape.Circle;
import com.gman.shape.Compound;
import com.gman.shape.Dot;
import com.gman.shape.Rectangle;
import com.gman.shape.Shape;
import com.gman.visitor.SimpleRenderer;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Shape dot = new Dot(3,5);
        Shape circle = new Circle(1,2, 25);
        Shape rectangle = new Rectangle(25, 35);

        List<Shape> simpleShapes = Arrays.asList(dot, circle, rectangle);
        Shape container = new Compound(simpleShapes);

        List<Shape> allShapes = Arrays.asList(dot, circle, rectangle, container);

        new SimpleRenderer().render(allShapes);

    }
}
