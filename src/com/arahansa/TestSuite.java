package com.arahansa;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jarvis on 2016. 11. 14..
 */
public class TestSuite {

  public List<TestCase> testCases;

  public TestSuite() {
    testCases = new ArrayList<>();
  }

  public void add(TestCase testCase){
    this.testCases.add(testCase);
  }

  public TestResult run(TestResult result) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    for(TestCase t : testCases){
      t.run(result);
    }
    return result;
  }

}