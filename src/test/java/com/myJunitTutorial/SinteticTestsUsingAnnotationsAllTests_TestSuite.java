package com.myJunitTutorial;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AnnotationBeforeAndAfterTestExample.class, AnnotationIgnoreExampleTest.class })

public class SinteticTestsUsingAnnotationsAllTests_TestSuite {

}
