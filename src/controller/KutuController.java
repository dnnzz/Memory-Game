/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Collections;
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
    public JToggleButton[] button = new JToggleButton[100];
    public Random generator = new Random();
    public int getKutuadedi() {
        return kutuadedi;
    }

    public void setKutuadedi(int kutuadedi) {
        this.kutuadedi = kutuadedi;
    }

    
    public void KutuUretGrid(JPanel jp){
       jp.setLayout(new GridLayout(2,4));
       
       for (int i = 0; i < kutuadedi; i++) {
            button[i] = new JToggleButton();
            button[i].setText(Integer.toString(20));
            button[i].setSize(1,1);
            jp.add(button[i]);
            button[i].setBackground(defaultColor);
            button[i].setVisible(true);
            
}
       if(kutuadedi %2 == 1){
           button[kutuadedi+1] = new JToggleButton("buton");
           button[kutuadedi+1].setSize(1,1);
           jp.add(button[kutuadedi+1]);
           button[kutuadedi+1].setBackground(defaultColor);
           button[kutuadedi+1].setVisible(true);
       }
}
     public void KutuUretFlow(JPanel jp){
      jp.setLayout(new FlowLayout(FlowLayout.LEFT));
       for (int i = 0; i < kutuadedi; i++) {
            button[i] = new JToggleButton("buton");
            button[i].setSize(1,1);
            jp.add(button[i]);
            button[i].setBackground(defaultColor);
            button[i].setVisible(true);
            
}
       if(kutuadedi %2 == 1){
           button[kutuadedi+1] = new JToggleButton("buton");
           button[kutuadedi+1].setSize(1,1);
           jp.add(button[kutuadedi+1]);
           button[kutuadedi+1].setBackground(defaultColor);
           button[kutuadedi+1].setVisible(true);
       }
    }
}
