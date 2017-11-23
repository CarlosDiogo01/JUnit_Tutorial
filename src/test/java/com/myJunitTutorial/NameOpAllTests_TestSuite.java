package com.myJunitTutorial;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CompareArraysTest.class, NameopTest.class })
public class NameOpAllTests_TestSuite {

}
