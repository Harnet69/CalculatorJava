package GUI;

import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame {

    public MyJFrame(String title, int width, int height, Component textField, Component buttonsBlock){
        super(title);
        super.setSize(width, height);
        setLocationRelativeTo(null);
        super.add(textField, BorderLayout.NORTH);
        super.add(buttonsBlock, BorderLayout.SOUTH);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
        super.setResizable(false);
    }
}
