package com.justted.chapter13;

import javax.swing.*;
import java.awt.*;

public class Button2{

  public static void main(String[] args){
    Button2 gui=new Button2();
    gui.go();
  }

  public void go(){
    JFrame frame=new JFrame();
    JButton button=new JButton("click this");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Font bigFont=new Font("serif",Font.BOLD,28);
    button.setFont(bigFont);
    frame.getContentPane().add(BorderLayout.NORTH,button);
    frame.setSize(200,200);
    frame.setVisible(true);
  }
}