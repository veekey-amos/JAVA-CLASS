package Ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class XandO {

    ArrayList<Integer> playerone = new ArrayList<>();
    ArrayList<Integer> playerTwo = new ArrayList<>();
}
    JFrame XandO = new JFrame("X and O");

    JButton btn1= new JButton()
    JButton btn2= new JButton()
    JButton btn3= new JButton()
    JButton btn4= new JButton()
    JButton btn5= new JButton()
    JButton btn6= new JButton()
    JButton btn7= new JButton()
    JButton btn8= new JButton()
    JButton btn9= new JButton()

JPanel myPanel = new JPanel(new GridLayout())

    void drawGrid(){
        myPanel.add(btn1);
        myPanel.add(btn2);
        myPanel.add(btn3);
        myPanel.add(btn4);
        myPanel.add(btn5);
        myPanel.add(btn6);
        myPanel.add(btn7);
        myPanel.add(btn8);
        myPanel.add(btn9);

        Playerone.add(1);
        playerone.add(2);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                IF (flag ==0){
                    playerOne.add*(1);
                    btn1.setEnabled();
                    btn1.setText("X");
                    flag = 1;
                } else if (flag ==1){
                    playerTwo.add(2);
                    btn1.setEnabled(false);
                    btn1.setText("O");
                    flag = 0;
                }
            }
        });

        XandO.add(myPanel);
        XandO.setsize(100,300);
        XandO.setVisible(true);
        XandO.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public static void main(string[]){
        new XandO = new XandO
}