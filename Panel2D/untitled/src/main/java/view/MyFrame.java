package view;

import javax.swing.*;


public class MyFrame extends JFrame {
    MyPanel panel;
    public MyFrame(MyPanel panel){
        this.panel = panel;
        add(panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
    }

}
