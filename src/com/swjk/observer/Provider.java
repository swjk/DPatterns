package com.swjk.observer;

interface Provider<T>{
  public void attach(T e);
  public void detach(T e);
  public void notifies();
}
