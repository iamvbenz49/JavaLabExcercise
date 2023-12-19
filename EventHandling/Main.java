package EventHandling;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Main extends JFrame implements MouseListener {
    // default constructor
    public static JLabel label;
    text()
    {
    }
    public static void main(String[] args) {
         JFrame frame = new JFrame();
         label = new JLabel();
        label.setText("Srinidhi Loganaadhan");
        label.setFont(new Font("Arial",Font.PLAIN,50));
        JPanel panel = new JPanel();
        panel.add(label);
        frame.add(panel);
        frame.setSize(800,800);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    public static void MouseListener(MouseEvent e){
        System.out.println("click");
        label.setText("Mouse Clicked "+ e.getX + " "+ e.getY());
    }
}


