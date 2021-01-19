package com.sand.automation.testobjects;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeSuite;

public class NewTest {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }
  @BeforeMethod
  public void beforeMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeSuite
  public void beforeSuite() {
  }

}
