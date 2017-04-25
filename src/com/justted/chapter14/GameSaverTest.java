package com.justted.chapter14;

import java.io.*;

public class GameSaverTest{
  public static void main(String[] args){
    GameCharacter one=new GameCharacter(50,"Elf",new String[]{"bow","sword","dust"});
    GameCharacter two=new GameCharacter(200,"Troll",new String[]{"bare hands","big ax"});
    GameCharacter three=new GameCharacter(120,"Magician",new String[]{"spell","invisibility"});

    try{
      ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("Game.ser"));
      os.writeObject(one);
      os.writeObject(two);
      os.writeObject(three);
      os.close();
    }catch(Exception ex){
       ex.printStackTrace();
    }
    one=null;
    two=null;
    three=null;

    try{
      ObjectInputStream is=new ObjectInputStream(new FileInputStream("Game.ser"));
      GameCharacter oneRestore=(GameCharacter)is.readObject();
      GameCharacter twoRestore=(GameCharacter)is.readObject();
      GameCharacter threeRestore=(GameCharacter)is.readObject();

      System.out.println("One's weapons: "+oneRestore.getWeapons());
      System.out.println("Two's weapons: "+twoRestore.getWeapons());
      System.out.println("Three's weapons: "+threeRestore.getWeapons());
    }catch(Exception ex){
       ex.printStackTrace();
    }
  }
}
