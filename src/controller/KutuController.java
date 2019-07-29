/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.shuffle;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Dnz
 */
public class KutuController extends JFrame implements ActionListener{
    public int kutuadedi;
    public Color defaultColor = Color.WHITE;
    public JButton[] button = new JButton[16];
    public ArrayList<Integer> gameList = new ArrayList<Integer>();
    private int[] btnID = new int[2];
    private int[] btnValue = new int[2];
    int counter = 0;
    public int getKutuadedi() {
        return kutuadedi;
    }

    public void setKutuadedi(int kutuadedi) {
        this.kutuadedi = kutuadedi;
    }
      public void setArrayListText() {
        int kadeti = getKutuadedi();
        if(getKutuadedi()%2==1){
            kadeti = getKutuadedi()+1;
        }
        for (int i = 0; i < 2; i++) {
            for (int ii = 1; ii < (kadeti / 2) + 1; ii++) {
                gameList.add(ii);
            }
        }
        shuffle(gameList); 
 }    
    public void KutuUretGrid(JPanel jp){
       jp.setLayout(new GridLayout(2,4));
       setArrayListText();
       
       for (int i = 0; i < gameList.size(); i++) {
            button[i] = new JButton();
            button[i].setSize(1,1);
            button[i].addActionListener(this);
            jp.add(button[i]);
            button[i].setBackground(defaultColor);
            button[i].setVisible(true);
            
}
}
     public void KutuUretFlow(JPanel jp){
      jp.setLayout(new FlowLayout(FlowLayout.LEFT));
      setArrayListText();
       for (int i = 0; i < gameList.size(); i++) {
            button[i] = new JButton();
            button[i].setSize(4,4);
            button[i].addActionListener(this);
            jp.add(button[i]);
            button[i].setBackground(defaultColor);
            button[i].setVisible(true);
            
}
}
        public boolean sameValues() {
        if (btnValue[0] == btnValue[1]) {
            return true;
        }
        return false;
    }
        @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < button.length; i++) {
            if (button[i] == e.getSource()) {
                button[i].setText("" + gameList.get(i));
                button[i].setEnabled(false);
                counter++;
                if (counter == 3) {
                    if (sameValues()) {
                        button[btnID[0]].setEnabled(false);
                        button[btnID[1]].setEnabled(false);
                    } else {
                        button[btnID[0]].setEnabled(true);
                        button[btnID[0]].setText("");
                        button[btnID[1]].setEnabled(true);
                        button[btnID[1]].setText("");
                    }
                    counter = 1;
                }
                if (counter == 1) {
                    btnID[0] = i;
                    btnValue[0] = gameList.get(i);
                }
                if (counter == 2) {
                    btnID[1] = i;
                    btnValue[1] = gameList.get(i);
                }
            }
        }
    }
}
