package com.justted.chapter12;

import javax.swing.*;
import java.awt.*;

public class SimpleGui3D{
  public static void main(String[] args){
  JFrame frame=new JFrame();
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  JButton button=new JButton("change colors");

  MyDrawPanelb drawPanel=new MyDrawPanelb();
  
  frame.getContentPane().add(BorderLayout.SOUTH,button);
  frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
  frame.setSize(300,300);
  frame.setVisible(true);
  }
}

class MyDrawPanelb extends JPanel{
  public void paintComponent(Graphics g){
    Graphics2D g2d=(Graphics2D) g;
    int red=(int)(Math.random()*255);
    int green=(int)(Math.random()*255);
    int blue=(int)(Math.random()*255);
    Color startColor=new Color(red,green,blue);

    red=(int)(Math.random()*255);
    green=(int)(Math.random()*255);
    blue=(int)(Math.random()*255);
    Color endColor=new Color(red,green,blue);

    GradientPaint gradient=new GradientPaint(70,70,startColor,150,150,endColor);
    g2d.setPaint(gradient);
    g2d.fillOval(70,70,100,100);
  }
}