package GUI;

import javax.swing.*;

import com.jtattoo.plaf.aero.AeroLookAndFeel;
import java.awt.*;

public class Gui extends JFrame {
    private JButton one, two, three, four, five, six, seven, eight, nine, zero, decim, plus, minus, mult, divide, remainder, equal, cancel;
    private JTextField textField;
    private JPanel firstPanel;
    private JFrame mainFrame;

    public JButton getOne() {
        return one;
    }

    public JButton getTwo() {
        return two;
    }

    public JButton getThree() {
        return three;
    }

    public JButton getFour() {
        return four;
    }

    public JButton getFive() {
        return five;
    }

    public JButton getSix() {
        return six;
    }

    public JButton getSeven() {
        return seven;
    }

    public JButton getEight() {
        return eight;
    }

    public JButton getZero() {
        return zero;
    }

    public JButton getDecim() { return decim; }

    public JButton getNine() {
        return nine;
    }

    public JButton getPlus() { return plus; }

    public JButton getMinus() {
        return minus;
    }

    public JButton getMult() {
        return mult;
    }

    public JButton getDivide() {
        return divide;
    }

    public JButton getRemainder() {
        return remainder;
    }

    public JButton getEqual() {
        return equal;
    }

    public JButton getCancel() {
        return cancel;
    }

    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }


    public Gui(){
        jtattooSkin();
        createTextField();
        createButtons();
        createPanel();
        createFrame();
    }

    /**
     * Possible Jtattoo skin : Jtattoo skin, AcrylLookAndFeel, AeroLookAndFeel, AluminiumLookAndFeel,
     * BernsteinLookAndFeel, FastLookAndFeel, HiFiLookAndFeel, McWinLookAndFeel, MintLookAndFeel,
     * NoireLookAndFeel, SmartLookAndFeel, LunaLookAndFeel, TextureLookAndFeel
     */
    private void jtattooSkin(){
        try {
            UIManager.setLookAndFeel(new AeroLookAndFeel());
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        JFrame.setDefaultLookAndFeelDecorated(true);
    }

    /**
     * Textfield to show action
     */
    private void createTextField(){
        textField = new JTextField(null, 24);
        textField.setEditable(false);
    }

    /**
     * Create buttons and set their dimension
     */

    public void createButtons(){
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
        decim = new JButton(",");
        plus = new JButton("+");
        minus = new JButton("-");
        mult = new JButton("*");
        divide = new JButton("/");
        remainder = new JButton("%");
        equal = new JButton("=");
        cancel = new JButton("CE/C");

        Dimension numSize = new Dimension(75,50);
        Dimension actSize = new Dimension(30,50);
        Dimension equalSize = new Dimension(120,50);
        Dimension funcSize = new Dimension(75,30);
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
        decim.setPreferredSize(actSize);
        divide.setPreferredSize(actSize);
        plus.setPreferredSize(actSize);
        minus.setPreferredSize(actSize);
        mult.setPreferredSize(actSize);
        remainder.setPreferredSize(actSize);
        equal.setPreferredSize(equalSize);
        cancel.setPreferredSize(funcSize);
        cancel.setBackground(Color.pink);
    }

    /**
     * Create panel
     */
    private void createPanel(){
        firstPanel = new JPanel();
        firstPanel.setLayout(new FlowLayout());
        firstPanel.add(textField, BorderLayout.NORTH);
        firstPanel.add(one); firstPanel.add(two); firstPanel.add(three);firstPanel.add(divide);
        firstPanel.add(four); firstPanel.add(five); firstPanel.add(six);firstPanel.add(mult);
        firstPanel.add(seven); firstPanel.add(eight); firstPanel.add(nine);firstPanel.add(plus);
        firstPanel.add(zero); firstPanel.add(decim); firstPanel.add(equal); firstPanel.add(minus);
        firstPanel.add(cancel); firstPanel.add(remainder);
    }

    /**
     * Create main frame
     */

    private void createFrame(){
        mainFrame = new JFrame("My Calculator");
//        mainFrame.add(firstPanel);
        mainFrame.setContentPane(firstPanel); // instead .add
        mainFrame.setSize(300,330);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
    }
}