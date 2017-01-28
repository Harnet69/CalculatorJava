package GUI;

import javax.swing.*;
import java.awt.*;

public class MyJFrame extends JFrame {

    public MyJFrame(String title, int width, int height, Component comp, Component pan2){
        super(title);
        super.setSize(width, height);
        setLocationRelativeTo(null);
        super.add(comp, BorderLayout.SOUTH);
        FlowLayout f1 = new FlowLayout();
        super.setLayout(f1);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
        super.setResizable(false);
    }
}
