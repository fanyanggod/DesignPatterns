package com.sherlock;

/**
 * @Author sherlock
 * @Date 2021/5/18
 */
public class ShapeFactory {
    public Shape getShape(String shapeType) {
        switch (shapeType) {
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            case "CIRCLE":
                return new Circle();
            default:
                return null;
        }
    }
}
