package com.gman.visitor;

import com.gman.shape.Circle;
import com.gman.shape.Compound;
import com.gman.shape.Dot;
import com.gman.shape.Rectangle;

/**
 * Created by Anton Mikhaylov on 24.09.2018.
 */
public interface RenderEngine {

    void renderDot(Dot d);
    void renderCircle(Circle c);
    void renderRectangle(Rectangle r);
    void renderCompound(Compound c);
}
