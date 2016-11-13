package com.arahansa;

/**
 * Created by jarvis on 2016. 11. 13..
 */
public class WasRun extends TestCase{

  boolean wasRun;

  public WasRun(String name) {
    super(name);
  }

  @Override
  public void setUp(){
    this.wasRun = false;
    this.wasSetUp = true;
    this.log = "setUp";
  }

  @Override
  public void tearDown(){
    this.log += " tearDown";
  }


  public void testMethod() {
    this.wasRun = true;
    this.log += " testMethod";
  }

  public void testBrokenMethod(){
    throw new RuntimeException();
  }
}
