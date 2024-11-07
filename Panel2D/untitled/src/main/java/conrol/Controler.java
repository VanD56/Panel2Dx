package conrol;
import conrol.action.Action;
import view.MyFrame;
import view.MyPanel;
import model.Model;
import model.MyShape;
import java.awt.*;
import java.util.Collection;

import conrol.action.ActionInterface;
public class Controler {
    MyPanel panel;
    MyFrame frame;
    Model model;
    ActionInterface  actionInterface;

    public Controler() {
        model = new Model();
        model.setCurrentShape(new MyShape());
        panel = new MyPanel(this);
        frame = new MyFrame(panel);
//        actionDraw.setSampleShape(new MyShape(Color.BLUE, new Rectangle2D.Double()));
        actionInterface =  new Action(model);
        frame.setController(this);
    }
    public ActionInterface setActionInterface(ActionInterface actionInterface) {
        this.actionInterface = actionInterface;
        actionInterface.setModel(model);
        return actionInterface;
    }
        public void mousePressed (Point point){
            actionInterface.mousePressed(point);
        }

        public void mouseDragged (Point point){
            actionInterface.mouseDragget(point);
        }

        public Collection<MyShape> translate () {
        return model.getList();
        }
}
