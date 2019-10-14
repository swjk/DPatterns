package com.swjk.observer;
import java.util.ArrayList;

public class Reader implements Observer<ArrayList<String>>{
  ArrayList<String> available_reads = new ArrayList<String>();

  @Override
  public void update(ArrayList<String> available_reads){
    this.available_reads = available_reads;
  }

  public void printAvailableReads(){
    System.out.print(available_reads);
  }
}
