package com.workintech.model;

import com.workintech.enums.PaintColor;

public class Ceiling {
    private int height;
    private PaintColor paintedColor;

    public Ceiling(int height, PaintColor paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public void create() {
        System.out.println("Height: " + height + ", Color: " + paintedColor);
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPaintedColor() {
        return paintedColor;
    }
}
