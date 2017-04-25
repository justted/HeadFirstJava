package com.justted.chapter4;

class ClockTestDrive
{
static class Clock
{
String time;

void setTime(String t)
  {
   time=t;
   }

String getTime()
  {
   return time;
   }
}

public static void main(String[] args)
  {
   Clock c=new Clock();
   c.setTime("12345");
   String tod=c.getTime();
   System.out.println("time: "+tod);
   }
}