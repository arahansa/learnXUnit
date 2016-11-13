package com.arahansa;

import java.lang.reflect.Method;

/**
 * Created by jarvis on 2016. 11. 13..
 */
public class TestCase  {
  String name;
  boolean wasSetUp;
  public String log;

  public TestCase(String name) {
    this.name = name;
  }

  public void setUp(){

  }
  public void tearDown(){

  }

  public TestResult run(TestResult result){
    result.testStarted();
    result.testStarted();
    this.setUp();
    try {
      final Method method = this.getClass().getMethod(this.name);
      method.invoke(this);
    } catch (Exception e) {
      result.testFailed();
    }
    this.tearDown();
    return result;
  }


}
