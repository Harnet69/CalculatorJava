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
        // Jtattoo skin
        try {
            UIManager.setLookAndFeel(new BernsteinLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        JFrame.setDefaultLookAndFeelDecorated(true);

        // Textfield to show action
        textField = new JTextField(null, 24);
        textField.setEditable(false);

        // Buttons
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        zero = new JButton("0");
        plus = new JButton("+");
        minus = new JButton("-");
        mult = new JButton("*");
        divide = new JButton("/");
        equal = new JButton("=");

        Dimension numSize = new Dimension(75,50);
        Dimension actSize = new Dimension(30,50);
        Dimension equalSize = new Dimension(155,50);
        one.setPreferredSize(numSize);
        two.setPreferredSize(numSize);
        three.setPreferredSize(numSize);
        four.setPreferredSize(numSize);
        five.setPreferredSize(numSize);
        six.setPreferredSize(numSize);
        seven.setPreferredSize(numSize);
        eight.setPreferredSize(numSize);
        nine.setPreferredSize(numSize);
        zero.setPreferredSize(numSize);
        divide.setPreferredSize(actSize);
        plus.setPreferredSize(actSize);
        minus.setPreferredSize(actSize);
        mult.setPreferredSize(actSize);
        equal.setPreferredSize(equalSize);


         // Panel
        firstPanel = new JPanel();
        firstPanel.setLayout(new FlowLayout());
        firstPanel.add(textField, BorderLayout.NORTH);
        firstPanel.add(one); firstPanel.add(two); firstPanel.add(three);firstPanel.add(divide);
        firstPanel.add(four); firstPanel.add(five); firstPanel.add(six);firstPanel.add(mult);
        firstPanel.add(seven); firstPanel.add(eight); firstPanel.add(nine);firstPanel.add(plus);
        firstPanel.add(zero); firstPanel.add(equal); firstPanel.add(minus);


        // Window frame
        mainFrame = new JFrame("My Calculator");
//        mainFrame.add(firstPanel);
        mainFrame.setContentPane(firstPanel); // instead .add
        mainFrame.setSize(300,285);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
    }

}
