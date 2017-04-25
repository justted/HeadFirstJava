package com.justted.chapter13;

import javax.swing.*;
import java.awt.*;

public class Button3{

  public static void main(String[] args){
    Button3 gui=new Button3();
    gui.go();
  }

  public void go(){
    JFrame frame=new JFrame();

    JButton east=new JButton("East");
    JButton west=new JButton("West");
    JButton north=new JButton("North");
    JButton south=new JButton("South");
    JButton center=new JButton("Center");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    frame.getContentPane().add(BorderLayout.EAST,east);
    frame.getContentPane().add(BorderLayout.WEST,west);
    frame.getContentPane().add(BorderLayout.NORTH,north);
    frame.getContentPane().add(BorderLayout.SOUTH,south);
    frame.getContentPane().add(BorderLayout.CENTER,center);

    frame.setSize(300,300);
    frame.setVisible(true);
  }
}