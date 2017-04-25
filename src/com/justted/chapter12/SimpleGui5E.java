package com.justted.chapter12;

import javax.swing.*;
import java.awt.*;

public class SimpleGui5E{
  public static void main(String[] args){
  JFrame frame=new JFrame();
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  JButton button=new JButton("change colors");

  MyDrawPanelC drawPanel=new MyDrawPanelC();
  
  frame.getContentPane().add(BorderLayout.SOUTH,button);
  frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
  frame.setSize(300,300);
  frame.setVisible(true);
  }
}

class MyDrawPanelC extends JPanel{
  public void paintComponent(Graphics g){
    g.fillRect(0,0,this.getWidth(),this.getHeight());

    int red=(int)(Math.random()*255);
    int green=(int)(Math.random()*255);
    int blue=(int)(Math.random()*255);

    Color randomColor=new Color(red,green,blue);
    g.setColor(randomColor);
    g.fillOval(70,70,100,100);
  }
}