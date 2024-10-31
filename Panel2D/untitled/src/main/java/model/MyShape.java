package model;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;
public class MyShape {
    Color color;
    RectangularShape shape;
    public MyShape() {
        color = Color.RED;
        shape = new Rectangle2D.Double();

    }
    public RectangularShape getShape() {
        return shape;
    }

    public void setShape(RectangularShape shape) {
        this.shape = shape;
    }
    public void addShape(Point2D[] p){
        shape.setFrameFromDiagonal(p[0],p[1]);
    }
    public void draw( Graphics2D g){
        Paint paint = g.getPaint();
        g.setColor(color);
        g.draw(shape);
        g.setPaint(paint);
    }
    public MyShape clone() {
        MyShape s = new MyShape();
        s.color = this.color;
        s.shape = (RectangularShape) shape.clone();
        return s;
    }



}
