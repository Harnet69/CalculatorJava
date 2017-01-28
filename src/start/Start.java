package start;

import GUI.MyJButton;
import GUI.MyJFrame;
import GUI.MyJPanel;
import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;
import javax.swing.*;
import java.awt.*;

public class Start {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new  BernsteinLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        JFrame.setDefaultLookAndFeelDecorated(true);
        MyJButton button1 = new MyJButton("1", 100, 100);
        JTextField myText = new JTextField(null,25);
        MyJPanel textField = new MyJPanel(300,200, myText);
        textField.setBackground(Color.green);
        MyJPanel buttonsBlock = new MyJPanel(300,200, button1);
        buttonsBlock.setBackground(Color.CYAN);

        MyJFrame frame1 = new MyJFrame("My Calculator", 500, 500, textField, buttonsBlock);
    }
}