package conrol.action;
import conrol.State;
import model.Model;
import model.MyShape;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Action implements ActionInterface {
    MyShape sampleShape;
    MyShape shape;
    Point2D[] p;
    Model model;
    State state;


    @Override
    public void setModel(Model model) {
        this.model = model;
    }

    public void setSampleShape(MyShape sampleShape) {
        this.sampleShape = sampleShape;
    }


    public Action(Model model) {
        shape = new MyShape();
        this.p = new Point2D[2];
        this.model = model;
        sampleShape = new MyShape(Color.BLUE,new Rectangle2D.Double());
    }

    public Action() {
        this.p = new Point2D[2];
        sampleShape = new MyShape(Color.BLUE,new Rectangle2D.Double());
    }

    public void setShapes(MyShape shape) {
        this.shape = shape;
    }
    public void stretchShape(Point2D point){
        p[1] = point;
        shape.setFrame(p);
    }
    public void createShape(Point2D point){
        p[0] = point;
        shape = sampleShape.clone();
        model.addShape(shape);
    }

    @Override
    public void mousePressed(Point point) {
        createShape(point);
    }

    @Override
    public void mouseDragget(Point point) {
        stretchShape(point);
    }

}
