package conrol;

import conrol.action.Action;
import conrol.action.ActionInterface;
import model.Model;
import model.MyShape;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RectangularShape;
import java.util.concurrent.atomic.AtomicReference;

public class State {
  //  RectangularShape shape;
    MyShape myShape;
    Model model;
    ActionInterface actionInterface;

    public State(Model model) {
        this.model = model;
        actionInterface = new Action(model);
        myShape = new MyShape(Color.BLUE,new Rectangle2D.Double());
    }

    public void setRectangularShape(RectangularShape shape) {
        //this.shape = shape;
        myShape.setShape(shape);
        actionInterface.setSampleShape(myShape);
    }
    public void setActionInterface(ActionInterface b) {
        actionInterface = b;
        actionInterface.setModel(model);

    }



    public ActionInterface getActionInterface() {
        return actionInterface;
    }

    public void setColor(Color c) {
        myShape.setcolor(c);
        actionInterface.setSampleShape(myShape);
    }
}
