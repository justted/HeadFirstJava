package com.justted.chapter13;

import javax.swing.*;
import java.awt.*;


public class Panel2{

  public static void main(String[] args){
    Panel2 gui=new Panel2();
    gui.go();
  }

  public void go(){
    JFrame frame=new JFrame();
    JPanel panel=new JPanel();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    panel.setBackground(Color.darkGray);

    panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));//换掉原来的布局管理器，换成BoxLayout

    JButton button=new JButton("shock me");
    JButton buttontwo=new JButton("bliss");
    panel.add(button);
    panel.add(buttontwo);
    frame.getContentPane().add(BorderLayout.EAST,panel);
    frame.setSize(250,200);
    frame.setVisible(true);
  }
}