package com.justted.chapter14;

import java.io.*;

public class Box1 implements Serializable{
  private int width;
  private int height;

  public void setWidth(int w){
    width=w;
  }

  public void setHeight(int h){
    height=h;
  }

  public static void main(String[] args){
    Box1 myBox=new Box1();
    myBox.setWidth(50);
    myBox.setHeight(20);

    try{
      FileOutputStream fs=new FileOutputStream("foo.ser");
      ObjectOutputStream os=new ObjectOutputStream(fs);
      os.writeObject(myBox);
      os.close();
    }catch(Exception ex){
       ex.printStackTrace();
    }
  }
}