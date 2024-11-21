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

    State state;

    public Controler() {

        model = new Model();
        state = new State(model);
        model.setCurrentShape(new MyShape());
        panel = new MyPanel(this);
        frame = new MyFrame(panel,state);

    }

        public void mousePressed (Point point){
            state.getActionInterface().mousePressed(point);
        }

        public void mouseDragged (Point point){
            state.getActionInterface().mouseDragget(point);
        }

        public Collection<MyShape> translate () {
        return model.getList();
        }
}
