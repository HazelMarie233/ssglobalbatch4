package org.ssglobal.training.codes.test;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
//@SelectClasses(value = {TestFruits.class, TestMathOp.class, TestClassification.class, TestProfile.class})
@SelectPackages(value = {"org.ssglobal.training.codes.test"}) // select the certain package

public class TestAllClasses {

}
