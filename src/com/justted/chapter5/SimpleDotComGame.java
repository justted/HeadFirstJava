package com.justted.chapter5;

public class SimpleDotComGame
{
public static void main(String[] args)
  {
   int numofGuesses=0;
   GameHelper helper=new GameHelper();

   SimpleDotCom theDotCom=new SimpleDotCom();
   int randomNum=(int)(Math.random()*5);

   int[] locations={randomNum,randomNum+1,randomNum+2};
   theDotCom.setLocationCells(locations);
   boolean isAlive=true;

   while(isAlive == true)
     {
      String guess=helper.getUserInput("enter a number");
      String result=theDotCom.checkYourself(guess);
      numofGuesses++;
      if(result.equals("kill"))
        {
         isAlive=false;
         System.out.println("You took "+numofGuesses+" guesses");
         }
      }
   }



}

