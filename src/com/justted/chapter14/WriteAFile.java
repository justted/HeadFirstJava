package com.justted.chapter14;

import java.io.*;

class WriteAFile{
  public static void main(String[] args){
    try{
      FileWriter writer=new FileWriter("Foo.txt");
      writer.write("hello foo!");
      writer.close();
    }catch(Exception ex){
       ex.printStackTrace();
    }
  }
}
