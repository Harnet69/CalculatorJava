package GUI;

import javax.swing.*;
import java.awt.*;

public class MyJPanel extends JPanel {

    public MyJPanel(int width, int height, Component comp){
        super.setSize(width, height);
        super.setBorder(BorderFactory.createEtchedBorder());
        //super.setLocation(100,100);
        super.add(comp);
    }
}
