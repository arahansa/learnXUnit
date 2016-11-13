package com.arahansa;

/**
 * Created by jarvis on 2016. 11. 14..
 */
public class TestResult {

  int runCount;
  int failureCount;

  public TestResult() {
    this.runCount = 0;
    this.failureCount = 0;
  }

  public void testStarted(){
    this.runCount++;
  }

  public String summary(){
    return String.format("%d run, %d failed", this.runCount, this.failureCount);
  }

  public void testFailed() {
    this.failureCount++;
  }
}
