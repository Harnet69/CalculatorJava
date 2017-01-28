package GUI;

import javax.swing.*;
import com.jtattoo.plaf.bernstein.BernsteinLookAndFeel;

import java.awt.*;

public class Gui extends JFrame {
    private JButton one,two,three,four, five, six, seven, eight, nine, zero, plus, minus, mult, divide, equal;
    private JTextField textField;
    private JPanel firstPanel;
    private JFrame mainFrame;

    public Gui(){
        try {
            UIManager.setLookAndFeel(new BernsteinLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        JFrame.setDefaultLookAndFeelDecorated(true);
        textField = new JTextField(null, 25);
        textField.setEditable(false);
        firstPanel = new JPanel();
        firstPanel.add(textField, BorderLayout.NORTH);
        mainFrame = new JFrame("My Calculator");
//        mainFrame.add(firstPanel);
        mainFrame.setContentPane(firstPanel); // instead .add
        mainFrame.setSize(300,300);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
    }

}
