/*
Copyright © swjk

Use Case - Observer Pattern:
  Publisher/Subscriber relations: one source - many subscribers

*/
package com.swjk.observer;
public class Example{
  public static void main(String[] args) {

    //Paper
    Newspaper reuters = new Newspaper();

    //Readers
    Reader r1 = new Reader();
    Reader r2= new Reader();

    //Attach readers
    reuters.attach(r1);
    reuters.attach(r2);

    r1.printAvailableReads();

    //Add new volume
    reuters.addVolume("New volume added");

    r1.printAvailableReads();
  }

}
