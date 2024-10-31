package model;


import java.awt.geom.Point2D;
import java.awt.geom.RectangularShape;
import java.util.ArrayList;
import java.util.Collection;

public class Model {
    MyShape currentShape;
    Collection<RectangularShape> list;
    private static Model model = null;
    private Model(){
        list = new ArrayList<>(); //создаем коллекцию фигур
    }

    //конструктор синглтона
    public static Model getInstance(){
        if (model == null){
            model = new Model();
        }
        return model;
    }

    public void addShape(Point2D[] points){
        currentShape = currentShape.clone() ;
        list.add(currentShape.getShape());
    }
    public void setCurrentShape(MyShape currentShape) {

        this.currentShape = currentShape;
    }
    public MyShape getCurrentShape() {

        return currentShape;
    }

    public Collection<RectangularShape> getList() {

        return list;
    }


    public void setFrame(Point2D[] points) {
        currentShape.addShape(points);
    }
}
