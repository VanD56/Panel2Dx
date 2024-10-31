package conrol;

import view.MyFrame;
import view.MyPanel;
import model.Model;
import model.MyShape;
import java.awt.*;
import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;
import java.util.Collection;

public class Controler {
    MyPanel panel;
    MyFrame frame;
    Model model;
    Point2D[] points;


    public Controler() {
        model = Model.getInstance();
        panel = new MyPanel(this);
        frame = new MyFrame(panel);
        points = new Point2D[2];
        model.setCurrentShape(new MyShape());

    }
        public void mousePressed (Point point){
            points[0] = point;
            model.addShape(points);
        }

        public void mouseDragged (Point point){
            points[1] = point;
            model.setFrame(points);
        }

        public Collection<RectangularShape> translate () {
            return model.getList();
        }
}
