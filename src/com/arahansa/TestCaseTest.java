package com.arahansa;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by jarvis on 2016. 11. 13..
 */
public class TestCaseTest extends TestCase{

  WasRun test;

  TestResult result = new TestResult();

  public TestCaseTest(String name) {
    super(name);
  }

  public void setUp(){

  }

  public void testTemplateMethod() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    this.test = new WasRun("testMethod");
    test.run(this.result);
    assert test.wasSetUp;
    assert "setUp testMethod tearDown".equals(this.test.log);
  }

  public void testResult() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    test = new WasRun("testMethod");
    test.run(this.result);
    assert "1 run, 0 failed".equals(this.result.summary());
  }

  public void testFailedResult() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    test = new WasRun("testBrokenMethod");
    test.run(this.result);
    assert "1 run, 1 failed".equals(this.result.summary());
  }

  public void testFailedResultFormatting(){
    this.result.testStarted();
    this.result.testFailed();
    assert "1 run, 1 failed".equals(this.result.summary());
  }

  public void testSuite() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    TestSuite suite = new TestSuite();
    suite.add(new WasRun("testMethod"));
    suite.add(new WasRun("testBrokenMethod"));
    suite.run(result);
    assert "2 run, 1 failed".equals(this.result.summary());
  }

}
