package com.arahansa;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by jarvis on 2016. 11. 13..
 */
public class Main {

  public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
    TestSuite suite = new TestSuite();
    suite.add(new TestCaseTest("testTemplateMethod"));
    suite.add(new TestCaseTest("testResult"));
    suite.add(new TestCaseTest("testFailedResultFormatting"));
    suite.add(new TestCaseTest("testFailedResult"));
    suite.add(new TestCaseTest("testSuite"));

    TestResult result = new TestResult();
    suite.run(result);
    System.out.println(result.summary());
  }

}
