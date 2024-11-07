package conrol.action;
import model.Model;
import model.MyShape;

import java.awt.*;

public interface ActionInterface {
    void mousePressed(Point point);

    void mouseDragget(Point point);

    void setModel(Model m);

    void setSampleShape(MyShape myShape);
}

