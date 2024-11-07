package model;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;
public class MyShape {
    Color color;
    RectangularShape shape;
    FillBih fillBehavior;
    public MyShape(Color color, RectangularShape shape) {
        this.color = color;
        this.shape = shape;
        this.fillBehavior = FillBih.FILL;
    }
    public MyShape() {
        color = Color.RED;
        shape = new Rectangle2D.Double();
        this.fillBehavior = FillBih.FILL;
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
        fillBehavior.draw(g,shape);
        g.setPaint(paint);
    }
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public FillBih getFillBih() {
        return fillBehavior;
    }
    public void setFrame(Point2D [] p){
        shape.setFrameFromDiagonal(p[0],p[1]);
    }


    public void setFillBih(FillBih fillBehavior) {
        this.fillBehavior = fillBehavior;
    }

        public MyShape clone() {
            MyShape s = new MyShape();
            s.setColor(this.color);
            s.fillBehavior = this.fillBehavior;
            s.setShape((RectangularShape) this.shape.clone());
            return s;
        }



}
