package logic;

import GUI.Gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Listeners and actions for main frame
 */
public class MainLogic {
    private boolean choose = false, clickIsEqual = false;
    private String steat1, steat2, answerSteat; // first number, second number
    private double answer = 0.0;
    private JButton one, two, three, four, five, six, seven, eight, nine, zero;
    private JTextField textField;

    public MainLogic() {
        Gui calc = new Gui();
        NumberButtons numb = new NumberButtons();
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
        textField = calc.getTextField();
        one.addActionListener(numb); two.addActionListener(numb); three.addActionListener(numb);
        four.addActionListener(numb);five.addActionListener(numb);six.addActionListener(numb);
        seven.addActionListener(numb);eight.addActionListener(numb);nine.addActionListener(numb);
        zero.addActionListener(numb);
    }

    public class NumberButtons implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            JButton src = (JButton) event.getSource();

            // if button "1" is pressed
            if(src.equals(one)){
                // if it is first operation (not any operation yet)
                if(clickIsEqual == false){
                    // if not another statement
                    if(steat1 == null){
                        steat1 = "1";
                    }
                    //if "1" are't first
                    else {
                        steat1 = steat1 + "1";
                    }
                }
                else{
                    if(steat2 == null){
                        steat2 = "1";
                    }
                    //if "1" are't first
                    else {
                        steat2 = steat1 + "1";
                    }
                }
            }

            if(src.equals(two)){
                // if it is first operation (not any operation yet)
                if(clickIsEqual == false){
                    // if not another statement
                    if(steat1 == null){
                        steat1 = "2";
                    }
                    //if "1" are't first
                    else {
                        steat1 = steat1 + "2";
                    }
                }
                else{
                    if(steat2 == null){
                        steat2 = "2";
                    }
                    //if "1" are't first
                    else {
                        steat2 = steat1 + "2";
                    }
                }
            }

            if(src.equals(three)){
                // if it is first operation (not any operation yet)
                if(clickIsEqual == false){
                    // if not another statement
                    if(steat1 == null){
                        steat1 = "3";
                    }
                    //if "1" are't first
                    else {
                        steat1 = steat1 + "3";
                    }
                }
                else{
                    if(steat2 == null){
                        steat2 = "3";
                    }
                    //if "1" are't first
                    else {
                        steat2 = steat1 + "3";
                    }
                }
            }

            if(src.equals(four)){
                // if it is first operation (not any operation yet)
                if(clickIsEqual == false){
                    // if not another statement
                    if(steat1 == null){
                        steat1 = "4";
                    }
                    //if "1" are't first
                    else {
                        steat1 = steat1 + "4";
                    }
                }
                else{
                    if(steat2 == null){
                        steat2 = "4";
                    }
                    //if "1" are't first
                    else {
                        steat2 = steat1 + "4";
                    }
                }
            }

            if(src.equals(five)){
                // if it is first operation (not any operation yet)
                if(clickIsEqual == false){
                    // if not another statement
                    if(steat1 == null){
                        steat1 = "5";
                    }
                    //if "1" are't first
                    else {
                        steat1 = steat1 + "5";
                    }
                }
                else{
                    if(steat2 == null){
                        steat2 = "5";
                    }
                    //if "1" are't first
                    else {
                        steat2 = steat1 + "5";
                    }
                }
            }

            if(src.equals(six)){
                // if it is first operation (not any operation yet)
                if(clickIsEqual == false){
                    // if not another statement
                    if(steat1 == null){
                        steat1 = "6";
                    }
                    //if "1" are't first
                    else {
                        steat1 = steat1 + "6";
                    }
                }
                else{
                    if(steat2 == null){
                        steat2 = "6";
                    }
                    //if "1" are't first
                    else {
                        steat2 = steat1 + "6";
                    }
                }
            }

            if(src.equals(seven)){
                // if it is first operation (not any operation yet)
                if(clickIsEqual == false){
                    // if not another statement
                    if(steat1 == null){
                        steat1 = "7";
                    }
                    //if "1" are't first
                    else {
                        steat1 = steat1 + "7";
                    }
                }
                else{
                    if(steat2 == null){
                        steat2 = "7";
                    }
                    //if "1" are't first
                    else {
                        steat2 = steat1 + "7";
                    }
                }
            }

            if(src.equals(eight)){
                // if it is first operation (not any operation yet)
                if(clickIsEqual == false){
                    // if not another statement
                    if(steat1 == null){
                        steat1 = "8";
                    }
                    //if "1" are't first
                    else {
                        steat1 = steat1 + "8";
                    }
                }
                else{
                    if(steat2 == null){
                        steat2 = "8";
                    }
                    //if "1" are't first
                    else {
                        steat2 = steat1 + "8";
                    }
                }
            }

            if(src.equals(nine)){
                // if it is first operation (not any operation yet)
                if(clickIsEqual == false){
                    // if not another statement
                    if(steat1 == null){
                        steat1 = "9";
                    }
                    //if "1" are't first
                    else {
                        steat1 = steat1 + "9";
                    }
                }
                else{
                    if(steat2 == null){
                        steat2 = "9";
                    }
                    //if "1" are't first
                    else {
                        steat2 = steat1 + "9";
                    }
                }
            }

            if(src.equals(zero)){
                // if it is first operation (not any operation yet)
                if(clickIsEqual == false){
                    // if not another statement
                    if(steat1 == null){
                        steat1 = "0";
                    }
                    //if "1" are't first
                    else {
                        steat1 = steat1 + "0";
                    }
                }
                else{
                    if(steat2 == null){
                        steat2 = "0";
                    }
                    //if "1" are't first
                    else {
                        steat2 = steat1 + "0";
                    }
                }
            }
            textField.setText("1");
            textField.setText(steat2);

            if(clickIsEqual == false){
                if (choose == false) {
                    textField.setText(steat1);
                }
            }
            else{
                textField.setText(steat2);
            }
        }
    }
}