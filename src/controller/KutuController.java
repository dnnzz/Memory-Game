/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.shuffle;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

/**
 *
 * @author Dnz
 */
public class KutuController extends JFrame{
    public int kutuadedi;
    public Color defaultColor = Color.WHITE;
    public JToggleButton[] button = new JToggleButton[16];
    public ArrayList<Integer> gameList = new ArrayList<Integer>();
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
            button[i] = new JToggleButton();
            button[i].setText(Integer.toString(gameList.get(i)));
            button[i].setSize(1,1);
            jp.add(button[i]);
            button[i].setBackground(defaultColor);
            button[i].setVisible(true);
            
}
}
     public void KutuUretFlow(JPanel jp){
      jp.setLayout(new FlowLayout(FlowLayout.LEFT));
      setArrayListText();
       for (int i = 0; i < gameList.size(); i++) {
            button[i] = new JToggleButton();
            button[i].setText(Integer.toString(gameList.get(i)));
            button[i].setSize(1,1);
            jp.add(button[i]);
            button[i].setBackground(defaultColor);
            button[i].setVisible(true);
            
}
}
}
