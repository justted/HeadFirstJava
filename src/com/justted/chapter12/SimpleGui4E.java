package com.justted.chapter12;

import javax.swing.*;
import java.awt.*;

public class SimpleGui4E{
  public static void main(String[] args){
  JFrame frame=new JFrame();
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  JButton button=new JButton("change colors");

  MyDrawPanelD drawPanel=new MyDrawPanelD();
  
  frame.getContentPane().add(BorderLayout.SOUTH,button);
  frame.getContentPane().add(BorderLayout.CENTER,drawPanel);
  frame.setSize(300,300);
  frame.setVisible(true);
  }
}

class MyDrawPanelD extends JPanel{
  public void paintComponent(Graphics g){
    Image image=new ImageIcon("Breakdown.jpg").getImage();
    g.drawImage(image,3,4,this);
  }
}