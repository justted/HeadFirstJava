package com.justted.chapter7;

class Monster{
  boolean frighten(int d){
    System.out.println("arrrgh");
    return true;
  }
}

class Vampire extends Monster{
  int fighten(int f){
  System.out.println("a bite?");
  return 1;
  }
}

class Dragon extends Monster{
  boolean frighten(int degree){
  System.out.println("breath fire");
  return true;
  }
}