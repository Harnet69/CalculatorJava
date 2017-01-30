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
    private String steat1, steat2, answerSteat;
    private double answer;
    private JButton one;

    public MainLogic() {
        Gui calc = new Gui();
        JButton one = calc.getOne();
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

                    }

                }
            }
        }
    }
}

