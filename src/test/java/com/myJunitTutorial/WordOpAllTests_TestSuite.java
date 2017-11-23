package com.myJunitTutorial;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ WordOpParameterizedTest.class, WordOpTest.class })
public class WordOpAllTests_TestSuite {

}
