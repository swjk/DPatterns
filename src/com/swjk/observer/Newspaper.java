package com.swjk.observer;
import java.util.LinkedList;
import java.util.ArrayList;

public class Newspaper implements Provider<Reader>{

  private LinkedList<Reader> sign_up_list = new LinkedList<Reader>();
  private ArrayList<String> volumes = new ArrayList<String>();

  public void addVolume(String new_volume){
    volumes.add(new_volume);
    this.notifies();
  }

  @Override
  public void attach(Reader name){
    sign_up_list.add(name);
  }


  @Override
  public void detach(Reader name){
    sign_up_list.remove(name);
  }

  @Override
  public void notifies(){
    for (Reader r : sign_up_list){
      r.update(volumes);
    }
  }
}
