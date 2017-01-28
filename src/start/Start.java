package start;

import GUI.MyJButton;
import GUI.MyJFrame;
import GUI.MyJPanel;
import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import javax.swing.*;
import java.awt.*;

public class Start {

    public static void main(String[] args) {
        MyJButton button1 = new MyJButton("Кнопка1", 100, 50);
        JTextField myText = new JTextField(null,25);
        //myText.setBackground(Color.cyan);
        MyJPanel pan1 = new MyJPanel(200,200, myText);
        MyJPanel pan2 = new MyJPanel(200,200, button1);
        pan2.setLocation(0, 50);

        MyJFrame frame1 = new MyJFrame("My Calculator", 300, 300, pan1, pan2);
    }
}