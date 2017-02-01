package logic;

import GUI.Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Listeners and actions for main frame
 */
public class MainLogic {
    private boolean choose = false;
    private boolean clickIsEqual = false;
    private String steat1, steat2, answerSteat; // first number, second number
    private double answer = 0.0;
    private String strAnswer;
    char oper = ' ';
    private JButton one, two, three, four, five, six, seven, eight, nine, zero, decim, plus, minus, mult, divide, remainder, equal, cancel;
    private JTextField textField;

    public MainLogic() {
        Gui calc = new Gui();
        NumberButtons numb = new NumberButtons();
        ActionButtons act = new ActionButtons();
        one = calc.getOne();
        two = calc.getTwo();
        three = calc.getThree();
        four = calc.getFour();
        five = calc.getFive();
        six = calc.getSix();
        seven = calc.getSeven();
        eight = calc.getEight();
        nine = calc.getNine();
        zero = calc.getZero();
        decim = calc.getDecim();
        plus = calc.getPlus();
        minus = calc.getMinus();
        mult = calc.getMult();
        divide = calc.getDivide();
        remainder = calc.getRemainder();
        equal = calc.getEqual();
        cancel = calc.getCancel();
        textField = calc.getTextField();
        one.addActionListener(numb);
        two.addActionListener(numb);
        three.addActionListener(numb);
        four.addActionListener(numb);
        five.addActionListener(numb);
        six.addActionListener(numb);
        seven.addActionListener(numb);
        eight.addActionListener(numb);
        nine.addActionListener(numb);
        zero.addActionListener(numb);
        decim.addActionListener(numb);
        plus.addActionListener(act);
        minus.addActionListener(act);
        mult.addActionListener(act);
        divide.addActionListener(act);
        remainder.addActionListener(act);
        equal.addActionListener(act);
        cancel.addActionListener(act);
    }

    public class NumberButtons implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JButton src = (JButton) event.getSource();

            // if button "1" is pressed
            if (src.equals(one)) {
                // if it is first operation (not any operation yet)
                if (clickIsEqual == false) {
                    // if not another statement
                    if (steat1 == null) {
                        steat1 = "1";
                    }
                    //if "1" are't first
                    else {
                        steat1 = steat1 + "1";
                    }
                } else {
                    if (steat2 == null) {
                        steat2 = "1";
                    }
                    //if "1" are't first
                    else {
                        steat2 = steat2 + "1";
                    }
                }
            }

            if (src.equals(two)) {
                // if it is first operation (not any operation yet)
                if (clickIsEqual == false) {
                    // if not another statement
                    if (steat1 == null) {
                        steat1 = "2";
                    }
                    //if "1" are't first
                    else {
                        steat1 = steat1 + "2";
                    }
                } else {
                    if (steat2 == null) {
                        steat2 = "2";
                    }
                    //if "1" are't first
                    else {
                        steat2 = steat2 + "2";
                    }
                }
            }

            if (src.equals(three)) {
                // if it is first operation (not any operation yet)
                if (clickIsEqual == false) {
                    // if not another statement
                    if (steat1 == null) {
                        steat1 = "3";
                    }
                    //if "1" are't first
                    else {
                        steat1 = steat1 + "3";
                    }
                } else {
                    if (steat2 == null) {
                        steat2 = "3";
                    }
                    //if "1" are't first
                    else {
                        steat2 = steat2 + "3";
                    }
                }
            }

            if (src.equals(four)) {
                // if it is first operation (not any operation yet)
                if (clickIsEqual == false) {
                    // if not another statement
                    if (steat1 == null) {
                        steat1 = "4";
                    }
                    //if "1" are't first
                    else {
                        steat1 = steat1 + "4";
                    }
                } else {
                    if (steat2 == null) {
                        steat2 = "4";
                    }
                    //if "1" are't first
                    else {
                        steat2 = steat2 + "4";
                    }
                }
            }

            if (src.equals(five)) {
                // if it is first operation (not any operation yet)
                if (clickIsEqual == false) {
                    // if not another statement
                    if (steat1 == null) {
                        steat1 = "5";
                    }
                    //if "1" are't first
                    else {
                        steat1 = steat1 + "5";
                    }
                } else {
                    if (steat2 == null) {
                        steat2 = "5";
                    }
                    //if "1" are't first
                    else {
                        steat2 = steat2 + "5";
                    }
                }
            }

            if (src.equals(six)) {
                // if it is first operation (not any operation yet)
                if (clickIsEqual == false) {
                    // if not another statement
                    if (steat1 == null) {
                        steat1 = "6";
                    }
                    //if "1" are't first
                    else {
                        steat1 = steat1 + "6";
                    }
                } else {
                    if (steat2 == null) {
                        steat2 = "6";
                    }
                    //if "1" are't first
                    else {
                        steat2 = steat2 + "6";
                    }
                }
            }

            if (src.equals(seven)) {
                // if it is first operation (not any operation yet)
                if (clickIsEqual == false) {
                    // if not another statement
                    if (steat1 == null) {
                        steat1 = "7";
                    }
                    //if "1" are't first
                    else {
                        steat1 = steat1 + "7";
                    }
                } else {
                    if (steat2 == null) {
                        steat2 = "7";
                    }
                    //if "1" are't first
                    else {
                        steat2 = steat2 + "7";
                    }
                }
            }

            if (src.equals(eight)) {
                // if it is first operation (not any operation yet)
                if (clickIsEqual == false) {
                    // if not another statement
                    if (steat1 == null) {
                        steat1 = "8";
                    }
                    //if "1" are't first
                    else {
                        steat1 = steat1 + "8";
                    }
                } else {
                    if (steat2 == null) {
                        steat2 = "8";
                    }
                    //if "1" are't first
                    else {
                        steat2 = steat2 + "8";
                    }
                }
            }

            if (src.equals(nine)) {
                // if it is first operation (not any operation yet)
                if (clickIsEqual == false) {
                    // if not another statement
                    if (steat1 == null) {
                        steat1 = "9";
                    }
                    //if "1" are't first
                    else {
                        steat1 = steat1 + "9";
                    }
                } else {
                    if (steat2 == null) {
                        steat2 = "9";
                    }
                    //if "1" are't first
                    else {
                        steat2 = steat2 + "9";
                    }
                }
            }

            if (src.equals(zero)) {
                // if it is first operation (not any operation yet)
                if (clickIsEqual == false) {
                    // if not another statement
                    if (steat1 == null) {
                        steat1 = "0";
                    }
                    //if "1" are't first
                    else {
                        steat1 = steat1 + "0";
                    }
                } else {
                    if (steat2 == null) {
                        steat2 = "0";
                    }
                    //if "1" are't first
                    else {
                        steat2 = steat2 + "0";
                    }
                }
            }

            // Press decimal button
            if (src.equals(decim)) {
                // if it is first operation (not any operation yet)
                if (clickIsEqual == false) {
                    // if not another statement
                    if (steat1 == null) {
                        steat1 = "0.";
                    }
                    //if number have decimal symbol ","
                    else {
                        if(steat1 != null){
                            if(steat1.contains(".")){
                                System.out.println("You have decimal symbol");
                            }
                            else{
                                steat1 +=".";
                            }
                        }
                    }
                } else {
                    // if not another statement
                    if (steat2 == null) {
                        steat2 = "0.";
                    }
                    //if number have decimal symbol ","
                    else {
                        if(steat2 != null){
                            if(steat2.contains(".")){
                                System.out.println("You have decimal symbol");
                            }
                            else{
                                steat2 +=".";
                            }
                        }

                    }
                }
            }


            if (clickIsEqual == false) {
                if (choose == false) {
                    textField.setText(steat1);
                }
            } else {
                textField.setText(steat2);
            }
        }
    }

    public class ActionButtons implements ActionListener {

        public void actionPerformed(ActionEvent event) {
            JButton src = (JButton) event.getSource();

            // Plus operation
            if (src.equals(plus)) {
                if (steat1 == null) {
                    System.out.print("You must add number first");
                } else if (steat1 != null && steat2 == null) {
                    clickIsEqual = true;
                    oper = '+';
                } else if (steat1 != null && steat2 != null) {
                    System.out.print("This is freeware version, calculator supported only two operation!");
                }
            }

            // Minus operation
            if (src.equals(minus)) {
                if (steat1 == null) {
                    System.out.print("You must add number first");
                } else if (steat1 != null && steat2 == null) {
                    clickIsEqual = true;
                    oper = '-';
                } else if (steat1 != null && steat2 != null) {
                    System.out.print("This is basic version calculator, supported only two operation!");
                }
            }

            // Mult operation
            if (src.equals(mult)) {
                if (steat1 == null) {
                    System.out.print("You must add number first");
                } else if (steat1 != null && steat2 == null) {
                    clickIsEqual = true;
                    oper = '*';
                } else if (steat1 != null && steat2 != null) {
                    System.out.print("This is basic version calculator, supported only two operation!");
                }
            }

            // Divide operation
            if (src.equals(divide)) {
                if (steat1 == null) {
                    System.out.print("You must add number first");
                } else if (steat1 != null && steat2 == null) {
                    clickIsEqual = true;
                    oper = '/';
                } else if (steat1 != null && steat2 != null) {
                    System.out.print("This is basic version calculator, supported only two operation!");
                }
            }

            // Divide operation
            if (src.equals(remainder)) {
                if (steat1 == null) {
                    System.out.print("You must add number first");
                } else if (steat1 != null && steat2 == null) {
                    clickIsEqual = true;
                    oper = '%';
                } else if (steat1 != null && steat2 != null) {
                    System.out.print("This is basic version calculator, supported only two operation!");
                }
            }

            // Cancel operation
            if (src.equals(cancel)) {
                steat1 = null; steat2 = null; strAnswer = null;clickIsEqual = false; oper = ' '; textField.setText(null);
                /*if (steat1 == null) {
                    System.out.print("You must add number first");
                } else if (steat1 != null && steat2 == null) {
                    clickIsEqual = true;
                    oper = '%';
                } else if (steat1 != null && steat2 != null) {
                    System.out.print("This is basic version calculator, supported only two operation!");
                }*/
            }

            // Equal operation
            if (src.equals(equal)) {
                if (steat1 == null) {
                    System.out.print("You must add number first");
                } else if (steat1 != null && steat2 == null) {
                    System.out.print("You must both number first");
                } else if (steat1 != null && steat2 != null) {
                    double d1 = 0.0, d2 = 0.0;
                    // Convert string value to the double
                    d1 = Double.parseDouble(steat1);
                    d2 = Double.parseDouble(steat2);

                    switch(oper){
                        case '+':
                            answer = d1 + d2; break;
                        case '-':
                            answer = d1 - d2; break;
                        case '/':
                            answer = d1 / d2; break;
                        case '*':
                            answer = d1 * d2; break;
                        case '%':
                            answer = d1 % d2; break;
                    }

                    // Convert double format answer to string for display in textField
                    strAnswer = Double.toString(answer);
                        if(d2 == 0.00 && oper == '/'){
                            textField.setText("ERROR! Divide by NULL");
                        }
                        else{
                            textField.setText(strAnswer);
                        }
                }
            }
        }
    }
}