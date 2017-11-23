package com.myJunitTutorial;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ PerformanceTest.class })
public class PerformanceAllTest_TestSuite {

}
