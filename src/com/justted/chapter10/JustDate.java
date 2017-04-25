package com.justted.chapter10;

import java.util.Date;

public class JustDate{

  public static void main(String[] args){
    
    String s=String.format("%tc",new Date());

    System.out.println(s);

  }
}