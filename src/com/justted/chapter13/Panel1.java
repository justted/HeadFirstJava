package com.justted.chapter13;

import javax.swing.*;
import java.awt.*;

public class Panel1{

  public static void main(String[] args){
    Panel1 gui=new Panel1();
    gui.go();
  }

  public void go(){
    JFrame frame=new JFrame();
    JPanel panel=new JPanel();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    panel.setBackground(Color.darkGray);
    JButton button=new JButton("shock me");
    JButton buttontwo=new JButton("bliss");
    JButton buttonthree=new JButton("huh?");

    panel.add(button);
    panel.add(buttontwo);
    panel.add(buttonthree);
    frame.getContentPane().add(BorderLayout.EAST,panel);

    frame.setSize(250,200);
    frame.setVisible(true);
  }
}