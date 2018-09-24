package com.gman.shape;

import com.gman.visitor.RenderEngine;

/**
 * Created by Anton Mikhaylov on 24.09.2018.
 */
public interface Shape {
    void accept(RenderEngine v);
}
